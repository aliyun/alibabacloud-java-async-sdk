// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserProdLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserProdLogsResponseBody</p>
 */
public class ListUserProdLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListUserProdLogsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserProdLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserProdLogsResponseBody build() {
            return new ListUserProdLogsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DisplayLine")
        private String displayLine;

        @NameInMap("Displayed")
        private Boolean displayed;

        @NameInMap("Imported")
        private Boolean imported;

        @NameInMap("IsDeleted")
        private Integer isDeleted;

        @NameInMap("MainUserId")
        private Long mainUserId;

        @NameInMap("SourceLogCode")
        private String sourceLogCode;

        @NameInMap("SourceLogInfo")
        private String sourceLogInfo;

        @NameInMap("SourceProdCode")
        private String sourceProdCode;

        @NameInMap("SubUserId")
        private Long subUserId;

        @NameInMap("SubUserName")
        private String subUserName;

        private Data(Builder builder) {
            this.displayLine = builder.displayLine;
            this.displayed = builder.displayed;
            this.imported = builder.imported;
            this.isDeleted = builder.isDeleted;
            this.mainUserId = builder.mainUserId;
            this.sourceLogCode = builder.sourceLogCode;
            this.sourceLogInfo = builder.sourceLogInfo;
            this.sourceProdCode = builder.sourceProdCode;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return displayLine
         */
        public String getDisplayLine() {
            return this.displayLine;
        }

        /**
         * @return displayed
         */
        public Boolean getDisplayed() {
            return this.displayed;
        }

        /**
         * @return imported
         */
        public Boolean getImported() {
            return this.imported;
        }

        /**
         * @return isDeleted
         */
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return sourceLogCode
         */
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        /**
         * @return sourceLogInfo
         */
        public String getSourceLogInfo() {
            return this.sourceLogInfo;
        }

        /**
         * @return sourceProdCode
         */
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private String displayLine; 
            private Boolean displayed; 
            private Boolean imported; 
            private Integer isDeleted; 
            private Long mainUserId; 
            private String sourceLogCode; 
            private String sourceLogInfo; 
            private String sourceProdCode; 
            private Long subUserId; 
            private String subUserName; 

            /**
             * DisplayLine.
             */
            public Builder displayLine(String displayLine) {
                this.displayLine = displayLine;
                return this;
            }

            /**
             * Displayed.
             */
            public Builder displayed(Boolean displayed) {
                this.displayed = displayed;
                return this;
            }

            /**
             * Imported.
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Integer isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * MainUserId.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * SourceLogCode.
             */
            public Builder sourceLogCode(String sourceLogCode) {
                this.sourceLogCode = sourceLogCode;
                return this;
            }

            /**
             * SourceLogInfo.
             */
            public Builder sourceLogInfo(String sourceLogInfo) {
                this.sourceLogInfo = sourceLogInfo;
                return this;
            }

            /**
             * SourceProdCode.
             */
            public Builder sourceProdCode(String sourceProdCode) {
                this.sourceProdCode = sourceProdCode;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * SubUserName.
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
