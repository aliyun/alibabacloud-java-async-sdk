// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetCanTrySasResponseBody} extends {@link TeaModel}
 *
 * <p>GetCanTrySasResponseBody</p>
 */
public class GetCanTrySasResponseBody extends TeaModel {
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

    private GetCanTrySasResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCanTrySasResponseBody create() {
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

        private Builder(GetCanTrySasResponseBody model) {
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

        public GetCanTrySasResponseBody build() {
            return new GetCanTrySasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCanTrySasResponseBody} extends {@link TeaModel}
     *
     * <p>GetCanTrySasResponseBody</p>
     */
    public static class BodyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanTry")
        private Integer canTry;

        @com.aliyun.core.annotation.NameInMap("CanTryVersions")
        private java.util.List<Integer> canTryVersions;

        @com.aliyun.core.annotation.NameInMap("TryType")
        private Integer tryType;

        private BodyData(Builder builder) {
            this.canTry = builder.canTry;
            this.canTryVersions = builder.canTryVersions;
            this.tryType = builder.tryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyData create() {
            return builder().build();
        }

        /**
         * @return canTry
         */
        public Integer getCanTry() {
            return this.canTry;
        }

        /**
         * @return canTryVersions
         */
        public java.util.List<Integer> getCanTryVersions() {
            return this.canTryVersions;
        }

        /**
         * @return tryType
         */
        public Integer getTryType() {
            return this.tryType;
        }

        public static final class Builder {
            private Integer canTry; 
            private java.util.List<Integer> canTryVersions; 
            private Integer tryType; 

            private Builder() {
            } 

            private Builder(BodyData model) {
                this.canTry = model.canTry;
                this.canTryVersions = model.canTryVersions;
                this.tryType = model.tryType;
            } 

            /**
             * CanTry.
             */
            public Builder canTry(Integer canTry) {
                this.canTry = canTry;
                return this;
            }

            /**
             * CanTryVersions.
             */
            public Builder canTryVersions(java.util.List<Integer> canTryVersions) {
                this.canTryVersions = canTryVersions;
                return this;
            }

            /**
             * TryType.
             */
            public Builder tryType(Integer tryType) {
                this.tryType = tryType;
                return this;
            }

            public BodyData build() {
                return new BodyData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCanTrySasResponseBody} extends {@link TeaModel}
     *
     * <p>GetCanTrySasResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private BodyData data;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private DataBody(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public BodyData getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private BodyData data; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.data = model.data;
                this.requestId = model.requestId;
            } 

            /**
             * Data.
             */
            public Builder data(BodyData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>0EBD97B8-65AD-52C8-94D5-A0F81E7D70D0</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCanTrySasResponseBody} extends {@link TeaModel}
     *
     * <p>GetCanTrySasResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * Body.
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
