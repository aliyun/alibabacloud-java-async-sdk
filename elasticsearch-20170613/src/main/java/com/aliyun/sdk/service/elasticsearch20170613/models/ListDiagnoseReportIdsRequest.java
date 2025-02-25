// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDiagnoseReportIdsRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnoseReportIdsRequest</p>
 */
public class ListDiagnoseReportIdsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
         * <p>The cluster ID.</p>
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
         * <p>The end of the time range to query. The value must be a UNIX timestamp.</p>
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
         * <p>The language of the reports.</p>
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
         * <p>The number of the page to return. Valid values: 1 to 200. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 500. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value must be a UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1595088000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The method that is used to trigger health diagnostics. Valid values: SYSTEM, INNER, and USER.</p>
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
        public ListDiagnoseReportIdsRequest build() {
            return new ListDiagnoseReportIdsRequest(this);
        } 

    } 

}
