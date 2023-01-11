// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTopicsRequest} extends {@link RequestModel}
 *
 * <p>ListTopicsRequest</p>
 */
public class ListTopicsRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("filter")
    private String filter;

    @Query
    @NameInMap("messageTypes")
    private java.util.List < String > messageTypes;

    @Query
    @NameInMap("pageNumber")
    @Validation(required = true, maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    @Validation(required = true, maximum = 10000, minimum = 10)
    private Integer pageSize;

    private ListTopicsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.filter = builder.filter;
        this.messageTypes = builder.messageTypes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicsRequest create() {
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return messageTypes
     */
    public java.util.List < String > getMessageTypes() {
        return this.messageTypes;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListTopicsRequest, Builder> {
        private String instanceId; 
        private String filter; 
        private java.util.List < String > messageTypes; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListTopicsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.filter = request.filter;
            this.messageTypes = request.messageTypes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 过滤条件
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * messageTypes.
         */
        public Builder messageTypes(java.util.List < String > messageTypes) {
            String messageTypesShrink = shrink(messageTypes, "messageTypes", "simple");
            this.putQueryParameter("messageTypes", messageTypesShrink);
            this.messageTypes = messageTypes;
            return this;
        }

        /**
         * 分页页码
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页大小
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListTopicsRequest build() {
            return new ListTopicsRequest(this);
        } 

    } 

}
