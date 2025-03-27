// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetHotelHomeBackImageAndModesResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelHomeBackImageAndModesResponseBody</p>
 */
public class GetHotelHomeBackImageAndModesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetHotelHomeBackImageAndModesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelHomeBackImageAndModesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetHotelHomeBackImageAndModesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetHotelHomeBackImageAndModesResponseBody build() {
            return new GetHotelHomeBackImageAndModesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotelHomeBackImageAndModesResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelHomeBackImageAndModesResponseBody</p>
     */
    public static class ModeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnName")
        private String cnName;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        private ModeList(Builder builder) {
            this.cnName = builder.cnName;
            this.code = builder.code;
            this.icon = builder.icon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModeList create() {
            return builder().build();
        }

        /**
         * @return cnName
         */
        public String getCnName() {
            return this.cnName;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        public static final class Builder {
            private String cnName; 
            private String code; 
            private String icon; 

            private Builder() {
            } 

            private Builder(ModeList model) {
                this.cnName = model.cnName;
                this.code = model.code;
                this.icon = model.icon;
            } 

            /**
             * CnName.
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            public ModeList build() {
                return new ModeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotelHomeBackImageAndModesResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelHomeBackImageAndModesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundImage")
        private String backgroundImage;

        @com.aliyun.core.annotation.NameInMap("HotelName")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("ModeList")
        private java.util.List<ModeList> modeList;

        private Result(Builder builder) {
            this.backgroundImage = builder.backgroundImage;
            this.hotelName = builder.hotelName;
            this.modeList = builder.modeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return backgroundImage
         */
        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return modeList
         */
        public java.util.List<ModeList> getModeList() {
            return this.modeList;
        }

        public static final class Builder {
            private String backgroundImage; 
            private String hotelName; 
            private java.util.List<ModeList> modeList; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.backgroundImage = model.backgroundImage;
                this.hotelName = model.hotelName;
                this.modeList = model.modeList;
            } 

            /**
             * BackgroundImage.
             */
            public Builder backgroundImage(String backgroundImage) {
                this.backgroundImage = backgroundImage;
                return this;
            }

            /**
             * HotelName.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * ModeList.
             */
            public Builder modeList(java.util.List<ModeList> modeList) {
                this.modeList = modeList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
