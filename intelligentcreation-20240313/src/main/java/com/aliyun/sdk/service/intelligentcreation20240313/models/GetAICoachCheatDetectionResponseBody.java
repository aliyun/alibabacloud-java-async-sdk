// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachCheatDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachCheatDetectionResponseBody</p>
 */
public class GetAICoachCheatDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cheatId")
    private String cheatId;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("imageCheat")
    private ImageCheat imageCheat;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("voiceCheat")
    private VoiceCheat voiceCheat;

    private GetAICoachCheatDetectionResponseBody(Builder builder) {
        this.cheatId = builder.cheatId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.gmtCreate = builder.gmtCreate;
        this.imageCheat = builder.imageCheat;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.voiceCheat = builder.voiceCheat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachCheatDetectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cheatId
     */
    public String getCheatId() {
        return this.cheatId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return imageCheat
     */
    public ImageCheat getImageCheat() {
        return this.imageCheat;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return voiceCheat
     */
    public VoiceCheat getVoiceCheat() {
        return this.voiceCheat;
    }

    public static final class Builder {
        private String cheatId; 
        private String errorCode; 
        private String errorMessage; 
        private String gmtCreate; 
        private ImageCheat imageCheat; 
        private String requestId; 
        private Integer status; 
        private Boolean success; 
        private VoiceCheat voiceCheat; 

        private Builder() {
        } 

        private Builder(GetAICoachCheatDetectionResponseBody model) {
            this.cheatId = model.cheatId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.gmtCreate = model.gmtCreate;
            this.imageCheat = model.imageCheat;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.voiceCheat = model.voiceCheat;
        } 

        /**
         * cheatId.
         */
        public Builder cheatId(String cheatId) {
            this.cheatId = cheatId;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * imageCheat.
         */
        public Builder imageCheat(ImageCheat imageCheat) {
            this.imageCheat = imageCheat;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>true</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * voiceCheat.
         */
        public Builder voiceCheat(VoiceCheat voiceCheat) {
            this.voiceCheat = voiceCheat;
            return this;
        }

        public GetAICoachCheatDetectionResponseBody build() {
            return new GetAICoachCheatDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAICoachCheatDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachCheatDetectionResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private List(Builder builder) {
            this.time = builder.time;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String time; 
            private String url; 

            private Builder() {
            } 

            private Builder(List model) {
                this.time = model.time;
                this.url = model.url;
            } 

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachCheatDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachCheatDetectionResponseBody</p>
     */
    public static class ImageCheat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private ImageCheat(Builder builder) {
            this.desc = builder.desc;
            this.list = builder.list;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCheat create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<List> list; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(ImageCheat model) {
                this.desc = model.desc;
                this.list = model.list;
                this.status = model.status;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * list.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ImageCheat build() {
                return new ImageCheat(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachCheatDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachCheatDetectionResponseBody</p>
     */
    public static class ComparisonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ComparisonList(Builder builder) {
            this.time = builder.time;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComparisonList create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String time; 
            private String url; 

            private Builder() {
            } 

            private Builder(ComparisonList model) {
                this.time = model.time;
                this.url = model.url;
            } 

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ComparisonList build() {
                return new ComparisonList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachCheatDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachCheatDetectionResponseBody</p>
     */
    public static class OriginalList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private OriginalList(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalList create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(OriginalList model) {
                this.url = model.url;
            } 

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public OriginalList build() {
                return new OriginalList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachCheatDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachCheatDetectionResponseBody</p>
     */
    public static class VoiceCheat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comparisonList")
        private java.util.List<ComparisonList> comparisonList;

        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("originalList")
        private java.util.List<OriginalList> originalList;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private VoiceCheat(Builder builder) {
            this.comparisonList = builder.comparisonList;
            this.desc = builder.desc;
            this.originalList = builder.originalList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceCheat create() {
            return builder().build();
        }

        /**
         * @return comparisonList
         */
        public java.util.List<ComparisonList> getComparisonList() {
            return this.comparisonList;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return originalList
         */
        public java.util.List<OriginalList> getOriginalList() {
            return this.originalList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<ComparisonList> comparisonList; 
            private String desc; 
            private java.util.List<OriginalList> originalList; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(VoiceCheat model) {
                this.comparisonList = model.comparisonList;
                this.desc = model.desc;
                this.originalList = model.originalList;
                this.status = model.status;
            } 

            /**
             * comparisonList.
             */
            public Builder comparisonList(java.util.List<ComparisonList> comparisonList) {
                this.comparisonList = comparisonList;
                return this;
            }

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * originalList.
             */
            public Builder originalList(java.util.List<OriginalList> originalList) {
                this.originalList = originalList;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public VoiceCheat build() {
                return new VoiceCheat(this);
            } 

        } 

    }
}
