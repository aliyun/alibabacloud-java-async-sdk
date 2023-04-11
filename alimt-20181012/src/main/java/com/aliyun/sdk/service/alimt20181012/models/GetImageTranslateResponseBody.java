// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageTranslateResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageTranslateResponseBody</p>
 */
public class GetImageTranslateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetImageTranslateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageTranslateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public GetImageTranslateResponseBody build() {
            return new GetImageTranslateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Orc")
        private String orc;

        @NameInMap("PictureEditor")
        private String pictureEditor;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.orc = builder.orc;
            this.pictureEditor = builder.pictureEditor;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orc
         */
        public String getOrc() {
            return this.orc;
        }

        /**
         * @return pictureEditor
         */
        public String getPictureEditor() {
            return this.pictureEditor;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String orc; 
            private String pictureEditor; 
            private String url; 

            /**
             * Orc.
             */
            public Builder orc(String orc) {
                this.orc = orc;
                return this;
            }

            /**
             * PictureEditor.
             */
            public Builder pictureEditor(String pictureEditor) {
                this.pictureEditor = pictureEditor;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
