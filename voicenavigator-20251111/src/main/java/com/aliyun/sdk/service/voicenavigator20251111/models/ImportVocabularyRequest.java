// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link ImportVocabularyRequest} extends {@link RequestModel}
 *
 * <p>ImportVocabularyRequest</p>
 */
public class ImportVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private ImportVocabularyRequest(Builder builder) {
        super(builder);
        this.fileKey = builder.fileKey;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportVocabularyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ImportVocabularyRequest, Builder> {
        private String fileKey; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ImportVocabularyRequest request) {
            super(request);
            this.fileKey = request.fileKey;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The path to the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>vocabulary/热词导入单元测试.zip</p>
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ImportVocabularyRequest build() {
            return new ImportVocabularyRequest(this);
        } 

    } 

}
