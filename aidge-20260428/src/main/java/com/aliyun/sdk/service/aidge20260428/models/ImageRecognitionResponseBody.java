// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link ImageRecognitionResponseBody} extends {@link TeaModel}
 *
 * <p>ImageRecognitionResponseBody</p>
 */
public class ImageRecognitionResponseBody extends TeaModel {
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

    private ImageRecognitionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageRecognitionResponseBody create() {
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

        private Builder(ImageRecognitionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The intelligent element recognition result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImageRecognitionResponseBody build() {
            return new ImageRecognitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageRecognitionResponseBody} extends {@link TeaModel}
     *
     * <p>ImageRecognitionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BorderPixel")
        private String borderPixel;

        @com.aliyun.core.annotation.NameInMap("NoobjCharacter")
        private Boolean noobjCharacter;

        @com.aliyun.core.annotation.NameInMap("NoobjLogo")
        private Boolean noobjLogo;

        @com.aliyun.core.annotation.NameInMap("NoobjNpx")
        private Boolean noobjNpx;

        @com.aliyun.core.annotation.NameInMap("NoobjWatermark")
        private Boolean noobjWatermark;

        @com.aliyun.core.annotation.NameInMap("ObjCharacter")
        private Boolean objCharacter;

        @com.aliyun.core.annotation.NameInMap("ObjLogo")
        private Boolean objLogo;

        @com.aliyun.core.annotation.NameInMap("ObjNpx")
        private Boolean objNpx;

        @com.aliyun.core.annotation.NameInMap("ObjWatermark")
        private Boolean objWatermark;

        @com.aliyun.core.annotation.NameInMap("PdNum")
        private Integer pdNum;

        @com.aliyun.core.annotation.NameInMap("PdProp")
        private String pdProp;

        @com.aliyun.core.annotation.NameInMap("RecText")
        private java.util.List<String> recText;

        @com.aliyun.core.annotation.NameInMap("TextProp")
        private String textProp;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.borderPixel = builder.borderPixel;
            this.noobjCharacter = builder.noobjCharacter;
            this.noobjLogo = builder.noobjLogo;
            this.noobjNpx = builder.noobjNpx;
            this.noobjWatermark = builder.noobjWatermark;
            this.objCharacter = builder.objCharacter;
            this.objLogo = builder.objLogo;
            this.objNpx = builder.objNpx;
            this.objWatermark = builder.objWatermark;
            this.pdNum = builder.pdNum;
            this.pdProp = builder.pdProp;
            this.recText = builder.recText;
            this.textProp = builder.textProp;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return borderPixel
         */
        public String getBorderPixel() {
            return this.borderPixel;
        }

        /**
         * @return noobjCharacter
         */
        public Boolean getNoobjCharacter() {
            return this.noobjCharacter;
        }

        /**
         * @return noobjLogo
         */
        public Boolean getNoobjLogo() {
            return this.noobjLogo;
        }

        /**
         * @return noobjNpx
         */
        public Boolean getNoobjNpx() {
            return this.noobjNpx;
        }

        /**
         * @return noobjWatermark
         */
        public Boolean getNoobjWatermark() {
            return this.noobjWatermark;
        }

        /**
         * @return objCharacter
         */
        public Boolean getObjCharacter() {
            return this.objCharacter;
        }

        /**
         * @return objLogo
         */
        public Boolean getObjLogo() {
            return this.objLogo;
        }

        /**
         * @return objNpx
         */
        public Boolean getObjNpx() {
            return this.objNpx;
        }

        /**
         * @return objWatermark
         */
        public Boolean getObjWatermark() {
            return this.objWatermark;
        }

        /**
         * @return pdNum
         */
        public Integer getPdNum() {
            return this.pdNum;
        }

        /**
         * @return pdProp
         */
        public String getPdProp() {
            return this.pdProp;
        }

        /**
         * @return recText
         */
        public java.util.List<String> getRecText() {
            return this.recText;
        }

        /**
         * @return textProp
         */
        public String getTextProp() {
            return this.textProp;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private String borderPixel; 
            private Boolean noobjCharacter; 
            private Boolean noobjLogo; 
            private Boolean noobjNpx; 
            private Boolean noobjWatermark; 
            private Boolean objCharacter; 
            private Boolean objLogo; 
            private Boolean objNpx; 
            private Boolean objWatermark; 
            private Integer pdNum; 
            private String pdProp; 
            private java.util.List<String> recText; 
            private String textProp; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.borderPixel = model.borderPixel;
                this.noobjCharacter = model.noobjCharacter;
                this.noobjLogo = model.noobjLogo;
                this.noobjNpx = model.noobjNpx;
                this.noobjWatermark = model.noobjWatermark;
                this.objCharacter = model.objCharacter;
                this.objLogo = model.objLogo;
                this.objNpx = model.objNpx;
                this.objWatermark = model.objWatermark;
                this.pdNum = model.pdNum;
                this.pdProp = model.pdProp;
                this.recText = model.recText;
                this.textProp = model.textProp;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The border pixel information, returned as a comma-separated string.</p>
             * 
             * <strong>example:</strong>
             * <p>8,10,0,1,330,330</p>
             */
            public Builder borderPixel(String borderPixel) {
                this.borderPixel = borderPixel;
                return this;
            }

            /**
             * <p>Indicates whether the non-subject area contains text.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder noobjCharacter(Boolean noobjCharacter) {
                this.noobjCharacter = noobjCharacter;
                return this;
            }

            /**
             * <p>Indicates whether the non-subject area contains a logo.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder noobjLogo(Boolean noobjLogo) {
                this.noobjLogo = noobjLogo;
                return this;
            }

            /**
             * <p>Indicates whether the non-subject area contains irrelevant pixels or noise.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder noobjNpx(Boolean noobjNpx) {
                this.noobjNpx = noobjNpx;
                return this;
            }

            /**
             * <p>Indicates whether the non-subject area contains a watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder noobjWatermark(Boolean noobjWatermark) {
                this.noobjWatermark = noobjWatermark;
                return this;
            }

            /**
             * <p>Indicates whether the subject area contains text.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objCharacter(Boolean objCharacter) {
                this.objCharacter = objCharacter;
                return this;
            }

            /**
             * <p>Indicates whether the subject area contains a logo.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder objLogo(Boolean objLogo) {
                this.objLogo = objLogo;
                return this;
            }

            /**
             * <p>Indicates whether the subject area contains irrelevant pixels or noise.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder objNpx(Boolean objNpx) {
                this.objNpx = objNpx;
                return this;
            }

            /**
             * <p>Indicates whether the subject area contains a watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder objWatermark(Boolean objWatermark) {
                this.objWatermark = objWatermark;
                return this;
            }

            /**
             * <p>The number of products.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pdNum(Integer pdNum) {
                this.pdNum = pdNum;
                return this;
            }

            /**
             * <p>The proportion of the product in the image.</p>
             * 
             * <strong>example:</strong>
             * <p>74.15%</p>
             */
            public Builder pdProp(String pdProp) {
                this.pdProp = pdProp;
                return this;
            }

            /**
             * <p>The list of recognized text.</p>
             */
            public Builder recText(java.util.List<String> recText) {
                this.recText = recText;
                return this;
            }

            /**
             * <p>The proportion of text in the image.</p>
             * 
             * <strong>example:</strong>
             * <p>7.52%</p>
             */
            public Builder textProp(String textProp) {
                this.textProp = textProp;
                return this;
            }

            /**
             * <p>The usage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessedImageCount&quot;:1}</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
