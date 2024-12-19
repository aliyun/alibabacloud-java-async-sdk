// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetSuspEventPageRequest} extends {@link RequestModel}
 *
 * <p>GetSuspEventPageRequest</p>
 */
public class GetSuspEventPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmEndTime")
    private Long alarmEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmStartTime")
    private Long alarmStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private GetSuspEventPageRequest(Builder builder) {
        super(builder);
        this.alarmEndTime = builder.alarmEndTime;
        this.alarmStartTime = builder.alarmStartTime;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuspEventPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmEndTime
     */
    public Long getAlarmEndTime() {
        return this.alarmEndTime;
    }

    /**
     * @return alarmStartTime
     */
    public Long getAlarmStartTime() {
        return this.alarmStartTime;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetSuspEventPageRequest, Builder> {
        private Long alarmEndTime; 
        private Long alarmStartTime; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String source; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetSuspEventPageRequest request) {
            super(request);
            this.alarmEndTime = request.alarmEndTime;
            this.alarmStartTime = request.alarmStartTime;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.source = request.source;
            this.status = request.status;
        } 

        /**
         * <p>Alarm end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1732515522000</p>
         */
        public Builder alarmEndTime(Long alarmEndTime) {
            this.putBodyParameter("AlarmEndTime", alarmEndTime);
            this.alarmEndTime = alarmEndTime;
            return this;
        }

        /**
         * <p>Alarm start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1722515522000</p>
         */
        public Builder alarmStartTime(Long alarmStartTime) {
            this.putBodyParameter("AlarmStartTime", alarmStartTime);
            this.alarmStartTime = alarmStartTime;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Alarm source.</p>
         * 
         * <strong>example:</strong>
         * <p>SUSP_EVENT</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>Disposal status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetSuspEventPageRequest build() {
            return new GetSuspEventPageRequest(this);
        } 

    } 

}
