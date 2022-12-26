// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchOperateCommonOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchOperateCommonOverallConfigRequest</p>
 */
public class BatchOperateCommonOverallConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("TypeList")
    @Validation(required = true)
    private java.util.List < String > typeList;

    private BatchOperateCommonOverallConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchOperateCommonOverallConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return typeList
     */
    public java.util.List < String > getTypeList() {
        return this.typeList;
    }

    public static final class Builder extends Request.Builder<BatchOperateCommonOverallConfigRequest, Builder> {
        private String config; 
        private java.util.List < String > typeList; 

        private Builder() {
            super();
        } 

        private Builder(BatchOperateCommonOverallConfigRequest request) {
            super(request);
            this.config = request.config;
            this.typeList = request.typeList;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * TypeList.
         */
        public Builder typeList(java.util.List < String > typeList) {
            this.putQueryParameter("TypeList", typeList);
            this.typeList = typeList;
            return this;
        }

        @Override
        public BatchOperateCommonOverallConfigRequest build() {
            return new BatchOperateCommonOverallConfigRequest(this);
        } 

    } 

}
