// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * The order in which the returned versions are sorted. Valid values:
         * <p>
         * 
         * *   **FORWARD**: The results are sorted in ascending order.
         * *   **BACKWARD**: The results are sorted in descending order.
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * The token required to obtain more results. If the number of layers exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The versions.
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
             * The time when the service version was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The description of the service version.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The last time when the service version was updated.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * The version of the service.
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
