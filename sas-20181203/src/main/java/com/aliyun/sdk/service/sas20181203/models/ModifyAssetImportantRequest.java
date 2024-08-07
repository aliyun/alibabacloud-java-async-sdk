// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAssetImportantRequest} extends {@link RequestModel}
 *
 * <p>ModifyAssetImportantRequest</p>
 */
public class ModifyAssetImportantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportantCode")
    private Integer importantCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private String uuidList;

    private ModifyAssetImportantRequest(Builder builder) {
        super(builder);
        this.importantCode = builder.importantCode;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAssetImportantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return importantCode
     */
    public Integer getImportantCode() {
        return this.importantCode;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyAssetImportantRequest, Builder> {
        private Integer importantCode; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAssetImportantRequest request) {
            super(request);
            this.importantCode = request.importantCode;
            this.uuidList = request.uuidList;
        } 

        /**
         * The importance of the asset. Valid values:
         * <p>
         * 
         * *   **0**: test
         * *   **1**: normal
         * *   **2**: important
         */
        public Builder importantCode(Integer importantCode) {
            this.putQueryParameter("ImportantCode", importantCode);
            this.importantCode = importantCode;
            return this;
        }

        /**
         * The UUIDs of servers. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyAssetImportantRequest build() {
            return new ModifyAssetImportantRequest(this);
        } 

    } 

}
