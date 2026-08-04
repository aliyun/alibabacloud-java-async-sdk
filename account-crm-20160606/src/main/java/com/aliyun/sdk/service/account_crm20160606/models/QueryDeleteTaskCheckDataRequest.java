// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryDeleteTaskCheckDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDeleteTaskCheckDataRequest</p>
 */
public class QueryDeleteTaskCheckDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LongLang")
    private String longLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private QueryDeleteTaskCheckDataRequest(Builder builder) {
        super(builder);
        this.agAccountType = builder.agAccountType;
        this.appName = builder.appName;
        this.longLang = builder.longLang;
        this.mpk = builder.mpk;
        this.pk = builder.pk;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeleteTaskCheckDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agAccountType
     */
    public String getAgAccountType() {
        return this.agAccountType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return longLang
     */
    public String getLongLang() {
        return this.longLang;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<QueryDeleteTaskCheckDataRequest, Builder> {
        private String agAccountType; 
        private String appName; 
        private String longLang; 
        private String mpk; 
        private String pk; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeleteTaskCheckDataRequest request) {
            super(request);
            this.agAccountType = request.agAccountType;
            this.appName = request.appName;
            this.longLang = request.longLang;
            this.mpk = request.mpk;
            this.pk = request.pk;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agAccountType(String agAccountType) {
            this.putQueryParameter("AgAccountType", agAccountType);
            this.agAccountType = agAccountType;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * LongLang.
         */
        public Builder longLang(String longLang) {
            this.putQueryParameter("LongLang", longLang);
            this.longLang = longLang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public QueryDeleteTaskCheckDataRequest build() {
            return new QueryDeleteTaskCheckDataRequest(this);
        } 

    } 

}
