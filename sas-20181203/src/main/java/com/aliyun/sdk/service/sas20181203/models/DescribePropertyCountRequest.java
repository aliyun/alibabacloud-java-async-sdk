// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The type of the asset fingerprints. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: port</li>
         * <li><strong>process</strong>: process</li>
         * <li><strong>software</strong>: software</li>
         * <li><strong>user</strong>: account</li>
         * <li><strong>cron</strong>: scheduled task</li>
         * <li><strong>sca</strong>: middleware</li>
         * <li><strong>web</strong>: website</li>
         * <li><strong>database</strong>: database</li>
         * <li><strong>lkm</strong>: kernel module</li>
         * <li><strong>autorun</strong>: startup item</li>
         * <li><strong>web_server</strong>: web service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port,process</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUIDs of the assets. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>9658314a-7609-4426-afc4-2c924072****,
         * 9658314a-7609-4426-afc4-2c924072****</p>
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
