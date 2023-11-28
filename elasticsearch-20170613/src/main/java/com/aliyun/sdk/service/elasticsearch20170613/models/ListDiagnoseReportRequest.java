// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseReportRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnoseReportRequest</p>
 */
public class ListDiagnoseReportRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("detail")
    private Boolean detail;

    @Query
    @NameInMap("endTime")
    @Validation(required = true, maximum = 2000000000000D, minimum = 1000000000000D)
    private Long endTime;

    @Query
    @NameInMap("lang")
    private String lang;

    @Query
    @NameInMap("page")
    @Validation(maximum = 200, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("size")
    @Validation(maximum = 500, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("startTime")
    @Validation(required = true, maximum = 2000000000000D, minimum = 1000000000000D)
    private Long startTime;

    @Query
    @NameInMap("trigger")
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
         * spanish
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SYSTEM
         */
        public Builder detail(Boolean detail) {
            this.putQueryParameter("detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * 1
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 1594569600000
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * 20
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * true
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * 1595174399999
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the request.
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
