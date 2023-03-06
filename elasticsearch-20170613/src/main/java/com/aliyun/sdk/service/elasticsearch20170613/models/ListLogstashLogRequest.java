// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashLogRequest} extends {@link RequestModel}
 *
 * <p>ListLogstashLogRequest</p>
 */
public class ListLogstashLogRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("beginTime")
    private Long beginTime;

    @Query
    @NameInMap("endTime")
    private Long endTime;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("query")
    @Validation(required = true)
    private String query;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private ListLogstashLogRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.query = builder.query;
        this.size = builder.size;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogstashLogRequest create() {
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
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListLogstashLogRequest, Builder> {
        private String instanceId; 
        private Long beginTime; 
        private Long endTime; 
        private Integer page; 
        private String query; 
        private Integer size; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListLogstashLogRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.page = request.page;
            this.query = request.query;
            this.size = request.size;
            this.type = request.type;
        } 

        /**
         * ls-cn-v0h1kzca\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 1531910852074
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * 1531910852074
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 1
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * host:10.7.xx.xx AND level:info AND content:opening
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * 20
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * LOGSTASH_INSTANCE_LOG
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListLogstashLogRequest build() {
            return new ListLogstashLogRequest(this);
        } 

    } 

}
