// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceOperateLog} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceOperateLog</p>
 */
public class GrafanaWorkspaceOperateLog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("date")
    private Float date;

    @com.aliyun.core.annotation.NameInMap("detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("operatorId")
    private String operatorId;

    private GrafanaWorkspaceOperateLog(Builder builder) {
        this.date = builder.date;
        this.detail = builder.detail;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.id = builder.id;
        this.operatorId = builder.operatorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceOperateLog create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public Float getDate() {
        return this.date;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    public static final class Builder {
        private Float date; 
        private String detail; 
        private String grafanaWorkspaceId; 
        private Long id; 
        private String operatorId; 

        private Builder() {
        } 

        private Builder(GrafanaWorkspaceOperateLog model) {
            this.date = model.date;
            this.detail = model.detail;
            this.grafanaWorkspaceId = model.grafanaWorkspaceId;
            this.id = model.id;
            this.operatorId = model.operatorId;
        } 

        /**
         * date.
         */
        public Builder date(Float date) {
            this.date = date;
            return this;
        }

        /**
         * detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * grafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * operatorId.
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public GrafanaWorkspaceOperateLog build() {
            return new GrafanaWorkspaceOperateLog(this);
        } 

    } 

}
