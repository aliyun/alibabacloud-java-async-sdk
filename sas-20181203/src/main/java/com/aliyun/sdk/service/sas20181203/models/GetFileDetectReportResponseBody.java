// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectReportResponseBody</p>
 */
public class GetFileDetectReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class Data extends TeaModel {
        @NameInMap("Basic")
        private String basic;

        @NameInMap("FileHash")
        private String fileHash;

        @NameInMap("Filename")
        private String filename;

        @NameInMap("HasData")
        private Boolean hasData;

        @NameInMap("Intelligences")
        private String intelligences;

        @NameInMap("Sandbox")
        private String sandbox;

        @NameInMap("ShowTab")
        private Boolean showTab;

        @NameInMap("ThreatLevel")
        private Long threatLevel;

        @NameInMap("ThreatTypes")
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
