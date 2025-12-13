// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunContractExtractRequest} extends {@link RequestModel}
 *
 * <p>RunContractExtractRequest</p>
 */
public class RunContractExtractRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fieldsToExtract")
    private java.util.List<FieldsToExtract> fieldsToExtract;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileOssUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileOssUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private RunContractExtractRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.fieldsToExtract = builder.fieldsToExtract;
        this.fileOssUrl = builder.fileOssUrl;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunContractExtractRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return fieldsToExtract
     */
    public java.util.List<FieldsToExtract> getFieldsToExtract() {
        return this.fieldsToExtract;
    }

    /**
     * @return fileOssUrl
     */
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RunContractExtractRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private java.util.List<FieldsToExtract> fieldsToExtract; 
        private String fileOssUrl; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RunContractExtractRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.fieldsToExtract = request.fieldsToExtract;
            this.fileOssUrl = request.fileOssUrl;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * fieldsToExtract.
         */
        public Builder fieldsToExtract(java.util.List<FieldsToExtract> fieldsToExtract) {
            String fieldsToExtractShrink = shrink(fieldsToExtract, "fieldsToExtract", "json");
            this.putBodyParameter("fieldsToExtract", fieldsToExtractShrink);
            this.fieldsToExtract = fieldsToExtract;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ttps://xxxxx.oss-cn-hangzhou.aliyuncs.com/legalmind/userdownload/4a83e0fe-baee-41d5-89f6-e33c8d462839/contract/report/9ce843d2-a05e-4351-9d69-15ae96bd910a_1713348901026.pdf</p>
         */
        public Builder fileOssUrl(String fileOssUrl) {
            this.putBodyParameter("fileOssUrl", fileOssUrl);
            this.fileOssUrl = fileOssUrl;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RunContractExtractRequest build() {
            return new RunContractExtractRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunContractExtractRequest} extends {@link TeaModel}
     *
     * <p>RunContractExtractRequest</p>
     */
    public static class FieldsToExtract extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("extractItem")
        private String extractItem;

        @com.aliyun.core.annotation.NameInMap("option")
        private java.util.List<String> option;

        private FieldsToExtract(Builder builder) {
            this.desc = builder.desc;
            this.extractItem = builder.extractItem;
            this.option = builder.option;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldsToExtract create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return extractItem
         */
        public String getExtractItem() {
            return this.extractItem;
        }

        /**
         * @return option
         */
        public java.util.List<String> getOption() {
            return this.option;
        }

        public static final class Builder {
            private String desc; 
            private String extractItem; 
            private java.util.List<String> option; 

            private Builder() {
            } 

            private Builder(FieldsToExtract model) {
                this.desc = model.desc;
                this.extractItem = model.extractItem;
                this.option = model.option;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * extractItem.
             */
            public Builder extractItem(String extractItem) {
                this.extractItem = extractItem;
                return this;
            }

            /**
             * option.
             */
            public Builder option(java.util.List<String> option) {
                this.option = option;
                return this;
            }

            public FieldsToExtract build() {
                return new FieldsToExtract(this);
            } 

        } 

    }
}
