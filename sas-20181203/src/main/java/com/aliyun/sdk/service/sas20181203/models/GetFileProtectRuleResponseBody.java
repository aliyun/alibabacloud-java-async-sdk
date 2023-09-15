// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectRuleResponseBody</p>
 */
public class GetFileProtectRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetFileProtectRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetFileProtectRuleResponseBody build() {
            return new GetFileProtectRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("AlertLevel")
        private Integer alertLevel;

        @NameInMap("FileOps")
        private java.util.List < String > fileOps;

        @NameInMap("FilePaths")
        private java.util.List < String > filePaths;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ProcPaths")
        private java.util.List < String > procPaths;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SwitchId")
        private String switchId;

        private Data(Builder builder) {
            this.action = builder.action;
            this.alertLevel = builder.alertLevel;
            this.fileOps = builder.fileOps;
            this.filePaths = builder.filePaths;
            this.id = builder.id;
            this.procPaths = builder.procPaths;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return alertLevel
         */
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return fileOps
         */
        public java.util.List < String > getFileOps() {
            return this.fileOps;
        }

        /**
         * @return filePaths
         */
        public java.util.List < String > getFilePaths() {
            return this.filePaths;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return procPaths
         */
        public java.util.List < String > getProcPaths() {
            return this.procPaths;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private String action; 
            private Integer alertLevel; 
            private java.util.List < String > fileOps; 
            private java.util.List < String > filePaths; 
            private Long id; 
            private java.util.List < String > procPaths; 
            private String ruleName; 
            private Integer status; 
            private String switchId; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AlertLevel.
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * FileOps.
             */
            public Builder fileOps(java.util.List < String > fileOps) {
                this.fileOps = fileOps;
                return this;
            }

            /**
             * FilePaths.
             */
            public Builder filePaths(java.util.List < String > filePaths) {
                this.filePaths = filePaths;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ProcPaths.
             */
            public Builder procPaths(java.util.List < String > procPaths) {
                this.procPaths = procPaths;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
