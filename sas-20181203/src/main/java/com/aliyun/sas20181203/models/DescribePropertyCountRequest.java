// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCountRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyCountRequest</p>
 */
public class DescribePropertyCountRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UuidList")
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

        private Builder(DescribePropertyCountRequest response) {
            super(response);
            this.type = response.type;
            this.uuidList = response.uuidList;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UuidList.
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
