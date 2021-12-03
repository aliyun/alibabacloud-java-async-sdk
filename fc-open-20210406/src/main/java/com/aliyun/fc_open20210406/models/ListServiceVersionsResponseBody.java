// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListServiceVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceVersionsResponseBody</p>
 */
public class ListServiceVersionsResponseBody extends TeaModel {
    @NameInMap("direction")
    private String direction;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("versions")
    private java.util.List < Versions> versions;


    private ListServiceVersionsResponseBody(Builder builder) {
        this.direction = builder.direction;
        this.nextToken = builder.nextToken;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return versions
     */
    public java.util.List < Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String direction; 
        private String nextToken; 
        private java.util.List < Versions> versions; 

        /**
         * <p>排序方向</p>
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * <p>下次查询token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>版本列表</p>
         */
        public Builder versions(java.util.List < Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ListServiceVersionsResponseBody build() {
            return new ListServiceVersionsResponseBody(this);
        } 

    } 

    public static class Versions extends TeaModel {
        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("description")
        private String description;

        @NameInMap("lastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("versionId")
        private String versionId;


        private Versions(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String lastModifiedTime; 
            private String versionId; 

            /**
             * <p>创建时间</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>版本描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>上次更新时间</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>版本ID</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
