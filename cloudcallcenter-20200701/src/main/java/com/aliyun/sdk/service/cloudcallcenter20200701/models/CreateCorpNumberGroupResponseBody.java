// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpNumberGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCorpNumberGroupResponseBody</p>
 */
public class CreateCorpNumberGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCorpNumberGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCorpNumberGroupResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public CreateCorpNumberGroupResponseBody build() {
            return new CreateCorpNumberGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("Description")
        private String description;

        @NameInMap("NumberCount")
        private String numberCount;

        @NameInMap("NumberGroupId")
        private String numberGroupId;

        @NameInMap("NumberGroupName")
        private String numberGroupName;

        private Data(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.description = builder.description;
            this.numberCount = builder.numberCount;
            this.numberGroupId = builder.numberGroupId;
            this.numberGroupName = builder.numberGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return numberCount
         */
        public String getNumberCount() {
            return this.numberCount;
        }

        /**
         * @return numberGroupId
         */
        public String getNumberGroupId() {
            return this.numberGroupId;
        }

        /**
         * @return numberGroupName
         */
        public String getNumberGroupName() {
            return this.numberGroupName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String description; 
            private String numberCount; 
            private String numberGroupId; 
            private String numberGroupName; 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * NumberCount.
             */
            public Builder numberCount(String numberCount) {
                this.numberCount = numberCount;
                return this;
            }

            /**
             * NumberGroupId.
             */
            public Builder numberGroupId(String numberGroupId) {
                this.numberGroupId = numberGroupId;
                return this;
            }

            /**
             * NumberGroupName.
             */
            public Builder numberGroupName(String numberGroupName) {
                this.numberGroupName = numberGroupName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
