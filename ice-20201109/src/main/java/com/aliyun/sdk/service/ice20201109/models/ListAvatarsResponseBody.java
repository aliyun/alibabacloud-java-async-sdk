// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvatarsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvatarsResponseBody</p>
 */
public class ListAvatarsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAvatarsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvatarsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListAvatarsResponseBody build() {
            return new ListAvatarsResponseBody(this);
        } 

    } 

    public static class AvatarList extends TeaModel {
        @NameInMap("AvatarDescription")
        private String avatarDescription;

        @NameInMap("AvatarId")
        private String avatarId;

        @NameInMap("AvatarName")
        private String avatarName;

        @NameInMap("AvatarType")
        private String avatarType;

        @NameInMap("Portrait")
        private String portrait;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("Transparent")
        private Boolean transparent;

        private AvatarList(Builder builder) {
            this.avatarDescription = builder.avatarDescription;
            this.avatarId = builder.avatarId;
            this.avatarName = builder.avatarName;
            this.avatarType = builder.avatarType;
            this.portrait = builder.portrait;
            this.thumbnail = builder.thumbnail;
            this.transparent = builder.transparent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarList create() {
            return builder().build();
        }

        /**
         * @return avatarDescription
         */
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return avatarName
         */
        public String getAvatarName() {
            return this.avatarName;
        }

        /**
         * @return avatarType
         */
        public String getAvatarType() {
            return this.avatarType;
        }

        /**
         * @return portrait
         */
        public String getPortrait() {
            return this.portrait;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return transparent
         */
        public Boolean getTransparent() {
            return this.transparent;
        }

        public static final class Builder {
            private String avatarDescription; 
            private String avatarId; 
            private String avatarName; 
            private String avatarType; 
            private String portrait; 
            private String thumbnail; 
            private Boolean transparent; 

            /**
             * AvatarDescription.
             */
            public Builder avatarDescription(String avatarDescription) {
                this.avatarDescription = avatarDescription;
                return this;
            }

            /**
             * AvatarId.
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * AvatarName.
             */
            public Builder avatarName(String avatarName) {
                this.avatarName = avatarName;
                return this;
            }

            /**
             * AvatarType.
             */
            public Builder avatarType(String avatarType) {
                this.avatarType = avatarType;
                return this;
            }

            /**
             * Portrait.
             */
            public Builder portrait(String portrait) {
                this.portrait = portrait;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Transparent.
             */
            public Builder transparent(Boolean transparent) {
                this.transparent = transparent;
                return this;
            }

            public AvatarList build() {
                return new AvatarList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AvatarList")
        private java.util.List < AvatarList> avatarList;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.avatarList = builder.avatarList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarList
         */
        public java.util.List < AvatarList> getAvatarList() {
            return this.avatarList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AvatarList> avatarList; 
            private Long totalCount; 

            /**
             * AvatarList.
             */
            public Builder avatarList(java.util.List < AvatarList> avatarList) {
                this.avatarList = avatarList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
