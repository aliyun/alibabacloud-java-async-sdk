// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetPersonalICodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetPersonalICodeResponseBody</p>
 */
public class GetPersonalICodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPersonalICodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonalICodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPersonalICodeResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BCE45E6D-9304-4F94-86BB-5A772B1615FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The AccessKey model.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;icode&quot;: &quot;V2Yc/dMFWBwTKLNCNxgnN<em><em><strong>z</strong></em>5ARu&quot;,
         *         &quot;icodeKey&quot;: &quot;b6f3</em>**32a62936&quot;,
         *         &quot;type&quot;: 1
         *     }</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPersonalICodeResponseBody build() {
            return new GetPersonalICodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPersonalICodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetPersonalICodeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Icode")
        private String icode;

        @com.aliyun.core.annotation.NameInMap("IcodeKey")
        private String icodeKey;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Result(Builder builder) {
            this.icode = builder.icode;
            this.icodeKey = builder.icodeKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return icode
         */
        public String getIcode() {
            return this.icode;
        }

        /**
         * @return icodeKey
         */
        public String getIcodeKey() {
            return this.icodeKey;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String icode; 
            private String icodeKey; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.icode = model.icode;
                this.icodeKey = model.icodeKey;
                this.type = model.type;
            } 

            /**
             * <p>SK</p>
             * 
             * <strong>example:</strong>
             * <p>V2Yc/dMFWBwTKLNCNxgnN*<em><strong>z</strong></em>5ARu</p>
             */
            public Builder icode(String icode) {
                this.icode = icode;
                return this;
            }

            /**
             * <p>AK</p>
             * 
             * <strong>example:</strong>
             * <p>asdasd</p>
             */
            public Builder icodeKey(String icodeKey) {
                this.icodeKey = icodeKey;
                return this;
            }

            /**
             * <p>The AccessKey type. Currently, only the value 1 is supported, which indicates a personal AccessKey.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
