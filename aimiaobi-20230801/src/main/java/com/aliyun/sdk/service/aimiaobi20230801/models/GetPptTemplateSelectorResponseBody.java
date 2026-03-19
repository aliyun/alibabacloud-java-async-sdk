// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetPptTemplateSelectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetPptTemplateSelectorResponseBody</p>
 */
public class GetPptTemplateSelectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPptTemplateSelectorResponseBody(Builder builder) {
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

    public static GetPptTemplateSelectorResponseBody create() {
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

        private Builder(GetPptTemplateSelectorResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
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

        public GetPptTemplateSelectorResponseBody build() {
            return new GetPptTemplateSelectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPptTemplateSelectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetPptTemplateSelectorResponseBody</p>
     */
    public static class Career extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsHot")
        private Long isHot;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Career(Builder builder) {
            this.id = builder.id;
            this.isHot = builder.isHot;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Career create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isHot
         */
        public Long getIsHot() {
            return this.isHot;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private Long isHot; 
            private String name; 

            private Builder() {
            } 

            private Builder(Career model) {
                this.id = model.id;
                this.isHot = model.isHot;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsHot.
             */
            public Builder isHot(Long isHot) {
                this.isHot = isHot;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Career build() {
                return new Career(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPptTemplateSelectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetPptTemplateSelectorResponseBody</p>
     */
    public static class Colour extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Colour(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Colour create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Colour model) {
                this.code = model.code;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Colour build() {
                return new Colour(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPptTemplateSelectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetPptTemplateSelectorResponseBody</p>
     */
    public static class SuitScene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SuitScene(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuitScene create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            private Builder() {
            } 

            private Builder(SuitScene model) {
                this.id = model.id;
                this.title = model.title;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SuitScene build() {
                return new SuitScene(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPptTemplateSelectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetPptTemplateSelectorResponseBody</p>
     */
    public static class SuitStyle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SuitStyle(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuitStyle create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            private Builder() {
            } 

            private Builder(SuitStyle model) {
                this.id = model.id;
                this.title = model.title;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SuitStyle build() {
                return new SuitStyle(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPptTemplateSelectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetPptTemplateSelectorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Career")
        private java.util.List<Career> career;

        @com.aliyun.core.annotation.NameInMap("Colour")
        private java.util.List<Colour> colour;

        @com.aliyun.core.annotation.NameInMap("SuitScene")
        private java.util.List<SuitScene> suitScene;

        @com.aliyun.core.annotation.NameInMap("SuitStyle")
        private java.util.List<SuitStyle> suitStyle;

        private Data(Builder builder) {
            this.career = builder.career;
            this.colour = builder.colour;
            this.suitScene = builder.suitScene;
            this.suitStyle = builder.suitStyle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return career
         */
        public java.util.List<Career> getCareer() {
            return this.career;
        }

        /**
         * @return colour
         */
        public java.util.List<Colour> getColour() {
            return this.colour;
        }

        /**
         * @return suitScene
         */
        public java.util.List<SuitScene> getSuitScene() {
            return this.suitScene;
        }

        /**
         * @return suitStyle
         */
        public java.util.List<SuitStyle> getSuitStyle() {
            return this.suitStyle;
        }

        public static final class Builder {
            private java.util.List<Career> career; 
            private java.util.List<Colour> colour; 
            private java.util.List<SuitScene> suitScene; 
            private java.util.List<SuitStyle> suitStyle; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.career = model.career;
                this.colour = model.colour;
                this.suitScene = model.suitScene;
                this.suitStyle = model.suitStyle;
            } 

            /**
             * Career.
             */
            public Builder career(java.util.List<Career> career) {
                this.career = career;
                return this;
            }

            /**
             * Colour.
             */
            public Builder colour(java.util.List<Colour> colour) {
                this.colour = colour;
                return this;
            }

            /**
             * SuitScene.
             */
            public Builder suitScene(java.util.List<SuitScene> suitScene) {
                this.suitScene = suitScene;
                return this;
            }

            /**
             * SuitStyle.
             */
            public Builder suitStyle(java.util.List<SuitStyle> suitStyle) {
                this.suitStyle = suitStyle;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
