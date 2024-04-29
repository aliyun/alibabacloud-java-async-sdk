// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCountRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyCountRequest</p>
 */
public class DescribePropertyCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private String uuidList;

    private DescribePropertyCountRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<DescribePropertyCountRequest, Builder> {
        private String type; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyCountRequest request) {
            super(request);
            this.type = request.type;
            this.uuidList = request.uuidList;
        } 

        /**
         * The type of the asset fingerprints. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   **port**: port
         * *   **process**: process
         * *   **software**: software
         * *   **user**: account
         * *   **cron**: scheduled task
         * *   **sca**: middleware
         * *   **web**: website
         * *   **database**: database
         * *   **lkm**: kernel module
         * *   **autorun**: startup item
         * *   **web_server**: web service
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUIDs of the assets. Separate multiple UUIDs with commas (,).
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public DescribePropertyCountRequest build() {
            return new DescribePropertyCountRequest(this);
        } 

    } 

}
