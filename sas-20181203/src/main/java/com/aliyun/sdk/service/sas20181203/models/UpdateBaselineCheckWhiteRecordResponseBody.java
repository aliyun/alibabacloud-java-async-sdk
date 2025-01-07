// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateBaselineCheckWhiteRecordResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBaselineCheckWhiteRecordResponseBody</p>
 */
public class UpdateBaselineCheckWhiteRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateBaselineCheckWhiteRecordResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBaselineCheckWhiteRecordResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBaselineCheckWhiteRecordResponseBody build() {
            return new UpdateBaselineCheckWhiteRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBaselineCheckWhiteRecordResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBaselineCheckWhiteRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.checkId = builder.checkId;
            this.lang = builder.lang;
            this.reason = builder.reason;
            this.recordId = builder.recordId;
            this.source = builder.source;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Long checkId; 
            private String lang; 
            private String reason; 
            private Long recordId; 
            private String source; 
            private String target; 
            private String targetType; 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>92</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The reason why the check item is added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the whitelist record.</p>
             * 
             * <strong>example:</strong>
             * <p>1582</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The data source. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: server</li>
             * <li><strong>agentless</strong>: agentless detection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>agentless</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The object that is added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>HOST_BASELINE_WHITE_LIST_23</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the assets on which the whitelist rule takes effect. Valid values:</p>
             * <ul>
             * <li><strong>all_instance</strong>: all servers</li>
             * <li><strong>instance</strong>: specific servers</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
