// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateFileImportTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateFileImportTemplateResponseBody</p>
 */
public class GenerateFileImportTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileDownloadUrl")
    private String fileDownloadUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateFileImportTemplateResponseBody(Builder builder) {
        this.fileDownloadUrl = builder.fileDownloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateFileImportTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileDownloadUrl
     */
    public String getFileDownloadUrl() {
        return this.fileDownloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileDownloadUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateFileImportTemplateResponseBody model) {
            this.fileDownloadUrl = model.fileDownloadUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The download URL of the template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/idaas_ly77wa2oexrciw5v672vxxxx/tmp/eiam_v2_user_import_1766469463365.csv">https://test.oss-cn-hangzhou.aliyuncs.com/idaas_ly77wa2oexrciw5v672vxxxx/tmp/eiam_v2_user_import_1766469463365.csv</a></p>
         */
        public Builder fileDownloadUrl(String fileDownloadUrl) {
            this.fileDownloadUrl = fileDownloadUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateFileImportTemplateResponseBody build() {
            return new GenerateFileImportTemplateResponseBody(this);
        } 

    } 

}
