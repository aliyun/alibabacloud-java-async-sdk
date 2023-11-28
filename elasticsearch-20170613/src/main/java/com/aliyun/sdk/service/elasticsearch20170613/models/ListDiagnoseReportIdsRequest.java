// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseReportIdsRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnoseReportIdsRequest</p>
 */
public class ListDiagnoseReportIdsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

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

    private ListDiagnoseReportIdsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
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

    public static ListDiagnoseReportIdsRequest create() {
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

    public static final class Builder extends Request.Builder<ListDiagnoseReportIdsRequest, Builder> {
        private String instanceId; 
        private Long endTime; 
        private String lang; 
        private Integer page; 
        private Integer size; 
        private Long startTime; 
        private String trigger; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnoseReportIdsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.page = request.page;
            this.size = request.size;
            this.startTime = request.startTime;
            this.trigger = request.trigger;
        } 

        /**
         * The cluster ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The end of the time range to query. The value must be a UNIX timestamp.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the reports.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of the page to return. Valid values: 1 to 200. Default value: 1.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 500. Default value: 10.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * The beginning of the time range to query. The value must be a UNIX timestamp.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The method that is used to trigger health diagnostics. Valid values: SYSTEM, INNER, and USER.
         */
        public Builder trigger(String trigger) {
            this.putQueryParameter("trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        @Override
        public ListDiagnoseReportIdsRequest build() {
            return new ListDiagnoseReportIdsRequest(this);
        } 

    } 

}
