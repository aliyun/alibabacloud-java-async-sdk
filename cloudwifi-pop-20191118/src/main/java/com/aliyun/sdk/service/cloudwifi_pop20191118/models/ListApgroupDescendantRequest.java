// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link ListApgroupDescendantRequest} extends {@link RequestModel}
 *
 * <p>ListApgroupDescendantRequest</p>
 */
public class ListApgroupDescendantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupUuid")
    private String apgroupUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cursor")
    private Long cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private Long level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListApgroupDescendantRequest(Builder builder) {
        super(builder);
        this.apgroupId = builder.apgroupId;
        this.apgroupUuid = builder.apgroupUuid;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.cursor = builder.cursor;
        this.level = builder.level;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApgroupDescendantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apgroupId
     */
    public Long getApgroupId() {
        return this.apgroupId;
    }

    /**
     * @return apgroupUuid
     */
    public String getApgroupUuid() {
        return this.apgroupUuid;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return cursor
     */
    public Long getCursor() {
        return this.cursor;
    }

    /**
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListApgroupDescendantRequest, Builder> {
        private Long apgroupId; 
        private String apgroupUuid; 
        private String appCode; 
        private String appName; 
        private Long cursor; 
        private Long level; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListApgroupDescendantRequest request) {
            super(request);
            this.apgroupId = request.apgroupId;
            this.apgroupUuid = request.apgroupUuid;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.cursor = request.cursor;
            this.level = request.level;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apgroupId(Long apgroupId) {
            this.putQueryParameter("ApgroupId", apgroupId);
            this.apgroupId = apgroupId;
            return this;
        }

        /**
         * ApgroupUuid.
         */
        public Builder apgroupUuid(String apgroupUuid) {
            this.putQueryParameter("ApgroupUuid", apgroupUuid);
            this.apgroupUuid = apgroupUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Cursor.
         */
        public Builder cursor(Long cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Long level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListApgroupDescendantRequest build() {
            return new ListApgroupDescendantRequest(this);
        } 

    } 

}
