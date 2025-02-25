// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDiagnoseReportRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnoseReportRequest</p>
 */
public class ListDiagnoseReportRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("detail")
    private Boolean detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2000000000000D, minimum = 1000000000000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2000000000000D, minimum = 1000000000000D)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trigger")
    private String trigger;

    private ListDiagnoseReportRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.detail = builder.detail;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.page = builder.page;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnoseReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return detail
     */
    public Boolean getDetail() {
        return this.detail;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return trigger
     */
    public String getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<ListDiagnoseReportRequest, Builder> {
        private String instanceId; 
        private Boolean detail; 
        private Long endTime; 
        private String lang; 
        private Integer page; 
        private Integer size; 
        private Long startTime; 
        private String trigger; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnoseReportRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.detail = request.detail;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.page = request.page;
            this.size = request.size;
            this.startTime = request.startTime;
            this.trigger = request.trigger;
        } 

        /**
         * <p>spanish</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1qu7ei000p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>SYSTEM</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder detail(Boolean detail) {
            this.putQueryParameter("detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>1</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1595174399999</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>1594569600000</p>
         * 
         * <strong>example:</strong>
         * <p>spanish</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>20</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>true</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>1595174399999</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1594569600000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        public Builder trigger(String trigger) {
            this.putQueryParameter("trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        @Override
        public ListDiagnoseReportRequest build() {
            return new ListDiagnoseReportRequest(this);
        } 

    } 

}
