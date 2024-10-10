// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExportSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportSuspEventsResponseBody</p>
 */
public class ExportSuspEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportSuspEventsResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportSuspEventsResponseBody create() {
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
    public Integer getId() {
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
        private Integer id; 
        private String requestId; 

        /**
         * <p>The name of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious_event_20221209</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the export record of the anomalous event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EF145C20-6A19-529A-8BDD-0671DXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportSuspEventsResponseBody build() {
            return new ExportSuspEventsResponseBody(this);
        } 

    } 

}
