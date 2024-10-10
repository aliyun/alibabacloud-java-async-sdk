// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExportWarningResponseBody} extends {@link TeaModel}
 *
 * <p>ExportWarningResponseBody</p>
 */
public class ExportWarningResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportWarningResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportWarningResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileName; 
        private Long id; 
        private String requestId; 

        /**
         * <p>The name of the file that contains exported baseline check results.</p>
         * 
         * <strong>example:</strong>
         * <p>health_check_export_20220407</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the task to export baseline check results.</p>
         * <blockquote>
         * <p>You can call use the value of this parameter to call the <a href="~~DescribeHcExportInfo~~">DescribeHcExportInfo</a> operation to query the export progress.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>439316</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A7FC828B-C242-1005-9736-C7CC5DC09FF0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportWarningResponseBody build() {
            return new ExportWarningResponseBody(this);
        } 

    } 

}
