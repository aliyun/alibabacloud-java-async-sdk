// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link ActiveInteractionCreateResponseBody} extends {@link TeaModel}
 *
 * <p>ActiveInteractionCreateResponseBody</p>
 */
public class ActiveInteractionCreateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ActiveInteractionCreateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveInteractionCreateResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ActiveInteractionCreateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AF54F772-60FF-56FD-A3EA-11620EF1229A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ActiveInteractionCreateResponseBody build() {
            return new ActiveInteractionCreateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ActiveInteractionCreateResponseBody} extends {@link TeaModel}
     *
     * <p>ActiveInteractionCreateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gesture")
        private String gesture;

        @com.aliyun.core.annotation.NameInMap("person")
        private String person;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        private Data(Builder builder) {
            this.gesture = builder.gesture;
            this.person = builder.person;
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gesture
         */
        public String getGesture() {
            return this.gesture;
        }

        /**
         * @return person
         */
        public String getPerson() {
            return this.person;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        public static final class Builder {
            private String gesture; 
            private String person; 
            private String scene; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gesture = model.gesture;
                this.person = model.person;
                this.scene = model.scene;
            } 

            /**
             * gesture.
             */
            public Builder gesture(String gesture) {
                this.gesture = gesture;
                return this;
            }

            /**
             * person.
             */
            public Builder person(String person) {
                this.person = person;
                return this;
            }

            /**
             * scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
