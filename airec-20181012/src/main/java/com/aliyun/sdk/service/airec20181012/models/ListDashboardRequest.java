// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardRequest</p>
 */
public class ListDashboardRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private Long endDate;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("Size")
    private Integer size;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private Long startDate;

    @Query
    @NameInMap("TraceId")
    @Validation(required = true)
    private String traceId;

    private ListDashboardRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endDate = builder.endDate;
        this.page = builder.page;
        this.sceneId = builder.sceneId;
        this.size = builder.size;
        this.startDate = builder.startDate;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardRequest create() {
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
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<ListDashboardRequest, Builder> {
        private String instanceId; 
        private Long endDate; 
        private Integer page; 
        private String sceneId; 
        private Integer size; 
        private Long startDate; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.endDate = response.endDate;
            this.page = response.page;
            this.sceneId = response.sceneId;
            this.size = response.size;
            this.startDate = response.startDate;
            this.traceId = response.traceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public ListDashboardRequest build() {
            return new ListDashboardRequest(this);
        } 

    } 

}
