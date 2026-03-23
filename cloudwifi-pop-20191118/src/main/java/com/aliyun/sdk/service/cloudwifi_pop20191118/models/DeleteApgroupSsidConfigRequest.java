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
 * {@link DeleteApgroupSsidConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteApgroupSsidConfigRequest</p>
 */
public class DeleteApgroupSsidConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteApgroupSsidConfigRequest(Builder builder) {
        super(builder);
        this.apgroupId = builder.apgroupId;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApgroupSsidConfigRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteApgroupSsidConfigRequest, Builder> {
        private Long apgroupId; 
        private String appCode; 
        private String appName; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApgroupSsidConfigRequest request) {
            super(request);
            this.apgroupId = request.apgroupId;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.id = request.id;
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
         * <p>This parameter is required.</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteApgroupSsidConfigRequest build() {
            return new DeleteApgroupSsidConfigRequest(this);
        } 

    } 

}
