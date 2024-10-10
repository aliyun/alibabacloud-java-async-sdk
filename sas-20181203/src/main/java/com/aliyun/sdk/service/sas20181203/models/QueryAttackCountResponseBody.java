// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryAttackCountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAttackCountResponseBody</p>
 */
public class QueryAttackCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAttackCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAttackCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer count; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>An array that consists of the numbers of alert events in different attack phases.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D4BE7D77-5B02-5126-A684-A73F6CD3XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether exceptions are handled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAttackCountResponseBody build() {
            return new QueryAttackCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAttackCountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAttackCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Integer eventCount;

        @com.aliyun.core.annotation.NameInMap("TacticId")
        private String tacticId;

        @com.aliyun.core.annotation.NameInMap("TacticType")
        private String tacticType;

        private Data(Builder builder) {
            this.eventCount = builder.eventCount;
            this.tacticId = builder.tacticId;
            this.tacticType = builder.tacticType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventCount
         */
        public Integer getEventCount() {
            return this.eventCount;
        }

        /**
         * @return tacticId
         */
        public String getTacticId() {
            return this.tacticId;
        }

        /**
         * @return tacticType
         */
        public String getTacticType() {
            return this.tacticType;
        }

        public static final class Builder {
            private Integer eventCount; 
            private String tacticId; 
            private String tacticType; 

            /**
             * <p>The number of times that the alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder eventCount(Integer eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The stage ID of the ATT&amp;CK attack.</p>
             * 
             * <strong>example:</strong>
             * <p>TA0043</p>
             */
            public Builder tacticId(String tacticId) {
                this.tacticId = tacticId;
                return this;
            }

            /**
             * <p>The type of stage of the ATT&amp;CK attack.</p>
             * 
             * <strong>example:</strong>
             * <p>Data collection</p>
             */
            public Builder tacticType(String tacticType) {
                this.tacticType = tacticType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
