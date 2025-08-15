// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017.models;

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
 * {@link GetFileDetectReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectReportResponseBody</p>
 */
public class GetFileDetectReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFileDetectReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetFileDetectReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFileDetectReportResponseBody build() {
            return new GetFileDetectReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileDetectReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileDetectReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Basic")
        private String basic;

        @com.aliyun.core.annotation.NameInMap("FileHash")
        private String fileHash;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("HasData")
        private Boolean hasData;

        @com.aliyun.core.annotation.NameInMap("Intelligences")
        private String intelligences;

        @com.aliyun.core.annotation.NameInMap("Sandbox")
        private String sandbox;

        @com.aliyun.core.annotation.NameInMap("ShowTab")
        private Boolean showTab;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private Long threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatTypes")
        private String threatTypes;

        private Data(Builder builder) {
            this.basic = builder.basic;
            this.fileHash = builder.fileHash;
            this.filename = builder.filename;
            this.hasData = builder.hasData;
            this.intelligences = builder.intelligences;
            this.sandbox = builder.sandbox;
            this.showTab = builder.showTab;
            this.threatLevel = builder.threatLevel;
            this.threatTypes = builder.threatTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return basic
         */
        public String getBasic() {
            return this.basic;
        }

        /**
         * @return fileHash
         */
        public String getFileHash() {
            return this.fileHash;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return hasData
         */
        public Boolean getHasData() {
            return this.hasData;
        }

        /**
         * @return intelligences
         */
        public String getIntelligences() {
            return this.intelligences;
        }

        /**
         * @return sandbox
         */
        public String getSandbox() {
            return this.sandbox;
        }

        /**
         * @return showTab
         */
        public Boolean getShowTab() {
            return this.showTab;
        }

        /**
         * @return threatLevel
         */
        public Long getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatTypes
         */
        public String getThreatTypes() {
            return this.threatTypes;
        }

        public static final class Builder {
            private String basic; 
            private String fileHash; 
            private String filename; 
            private Boolean hasData; 
            private String intelligences; 
            private String sandbox; 
            private Boolean showTab; 
            private Long threatLevel; 
            private String threatTypes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.basic = model.basic;
                this.fileHash = model.fileHash;
                this.filename = model.filename;
                this.hasData = model.hasData;
                this.intelligences = model.intelligences;
                this.sandbox = model.sandbox;
                this.showTab = model.showTab;
                this.threatLevel = model.threatLevel;
                this.threatTypes = model.threatTypes;
            } 

            /**
             * Basic.
             */
            public Builder basic(String basic) {
                this.basic = basic;
                return this;
            }

            /**
             * FileHash.
             */
            public Builder fileHash(String fileHash) {
                this.fileHash = fileHash;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * HasData.
             */
            public Builder hasData(Boolean hasData) {
                this.hasData = hasData;
                return this;
            }

            /**
             * Intelligences.
             */
            public Builder intelligences(String intelligences) {
                this.intelligences = intelligences;
                return this;
            }

            /**
             * Sandbox.
             */
            public Builder sandbox(String sandbox) {
                this.sandbox = sandbox;
                return this;
            }

            /**
             * ShowTab.
             */
            public Builder showTab(Boolean showTab) {
                this.showTab = showTab;
                return this;
            }

            /**
             * ThreatLevel.
             */
            public Builder threatLevel(Long threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * ThreatTypes.
             */
            public Builder threatTypes(String threatTypes) {
                this.threatTypes = threatTypes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
