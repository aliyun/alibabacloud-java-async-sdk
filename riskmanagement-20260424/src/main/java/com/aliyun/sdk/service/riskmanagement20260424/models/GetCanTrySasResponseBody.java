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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message. The value is the same as the Code parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B48613E-86DE-5411-BDBE-429C80B45F3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current API call is successful. This does not indicate whether subsequent business operations are successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>Indicates whether the user is eligible for a free trial. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Eligible.</li>
             * <li><strong>0</strong>: Not eligible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder canTry(Integer canTry) {
                this.canTry = canTry;
                return this;
            }

            /**
             * <p>The list of editions available for trial.</p>
             */
            public Builder canTryVersions(java.util.List<Integer> canTryVersions) {
                this.canTryVersions = canTryVersions;
                return this;
            }

            /**
             * <p>The trial type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Trial is not allowed.</li>
             * <li><strong>1</strong>: First trial.</li>
             * <li><strong>2</strong>: Second trial.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The data.</p>
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
             * <p>The message body.</p>
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
