// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetShipperStatusRequest} extends {@link RequestModel}
 *
 * <p>GetShipperStatusRequest</p>
 */
public class GetShipperStatusRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("shipperName")
    @Validation(required = true)
    private String shipperName;

    @Query
    @NameInMap("from")
    @Validation(required = true)
    private Long from;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("status")
    private String status;

    @Query
    @NameInMap("to")
    @Validation(required = true)
    private Long to;

    private GetShipperStatusRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.shipperName = builder.shipperName;
        this.from = builder.from;
        this.offset = builder.offset;
        this.project = builder.project;
        this.size = builder.size;
        this.status = builder.status;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShipperStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return shipperName
     */
    public String getShipperName() {
        return this.shipperName;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetShipperStatusRequest, Builder> {
        private String logstore; 
        private String shipperName; 
        private Long from; 
        private Integer offset; 
        private String project; 
        private Integer size; 
        private String status; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetShipperStatusRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
            this.from = request.from;
            this.offset = request.offset;
            this.project = request.project;
            this.size = request.size;
            this.status = request.status;
            this.to = request.to;
        } 

        /**
         * Logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 日志投递名称。
         */
        public Builder shipperName(String shipperName) {
            this.putPathParameter("shipperName", shipperName);
            this.shipperName = shipperName;
            return this;
        }

        /**
         * 日志投递任务创建开始时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * 查询开始行，默认值为0。
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 分页查询时，设置的每页行数。默认值为100，最大值为500。
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * 默认为空，表示返回所有状态的任务，支持success、fail和running状态。
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * 日志投递任务创建结束时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetShipperStatusRequest build() {
            return new GetShipperStatusRequest(this);
        } 

    } 

}
