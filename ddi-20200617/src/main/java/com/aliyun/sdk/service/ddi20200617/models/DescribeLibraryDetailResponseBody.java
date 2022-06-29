// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLibraryDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLibraryDetailResponseBody</p>
 */
public class DescribeLibraryDetailResponseBody extends TeaModel {
    @NameInMap("BizId")
    private String bizId;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("LibraryVersion")
    private String libraryVersion;

    @NameInMap("Name")
    private String name;

    @NameInMap("Properties")
    private String properties;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scope")
    private String scope;

    @NameInMap("SourceLocation")
    private String sourceLocation;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("Type")
    private String type;

    @NameInMap("UserId")
    private String userId;

    private DescribeLibraryDetailResponseBody(Builder builder) {
        this.bizId = builder.bizId;
        this.createTime = builder.createTime;
        this.libraryVersion = builder.libraryVersion;
        this.name = builder.name;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.sourceLocation = builder.sourceLocation;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLibraryDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return libraryVersion
     */
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return sourceLocation
     */
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String bizId; 
        private Long createTime; 
        private String libraryVersion; 
        private String name; 
        private String properties; 
        private String requestId; 
        private String scope; 
        private String sourceLocation; 
        private String sourceType; 
        private String type; 
        private String userId; 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * LibraryVersion.
         */
        public Builder libraryVersion(String libraryVersion) {
            this.libraryVersion = libraryVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(String properties) {
            this.properties = properties;
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
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * SourceLocation.
         */
        public Builder sourceLocation(String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DescribeLibraryDetailResponseBody build() {
            return new DescribeLibraryDetailResponseBody(this);
        } 

    } 

}
