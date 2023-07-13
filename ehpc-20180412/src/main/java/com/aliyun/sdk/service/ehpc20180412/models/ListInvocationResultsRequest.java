// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInvocationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListInvocationResultsRequest</p>
 */
public class ListInvocationResultsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CommandId")
    @Validation(required = true)
    private String commandId;

    @Query
    @NameInMap("Instance")
    private java.util.List < Instance> instance;

    @Query
    @NameInMap("InvokeRecordStatus")
    private String invokeRecordStatus;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    private ListInvocationResultsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.commandId = builder.commandId;
        this.instance = builder.instance;
        this.invokeRecordStatus = builder.invokeRecordStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvocationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return instance
     */
    public java.util.List < Instance> getInstance() {
        return this.instance;
    }

    /**
     * @return invokeRecordStatus
     */
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
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

    public static final class Builder extends Request.Builder<ListInvocationResultsRequest, Builder> {
        private String clusterId; 
        private String commandId; 
        private java.util.List < Instance> instance; 
        private String invokeRecordStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListInvocationResultsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.commandId = request.commandId;
            this.instance = request.instance;
            this.invokeRecordStatus = request.invokeRecordStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the command.
         * <p>
         * 
         * You can call the [ListCommands](~~87388~~) operation to query the command ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The status of the command that you want to query. Valid values:
         * <p>
         * 
         * *   Finished
         * *   Running
         * *   Failed
         * *   Stopped
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(java.util.List < Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Page numbers start from 1.
         * 
         * Default value: 1
         */
        public Builder invokeRecordStatus(String invokeRecordStatus) {
            this.putQueryParameter("InvokeRecordStatus", invokeRecordStatus);
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 50.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the node on which the command is run.
         * <p>
         * 
         * >  The Instance.N.Id parameter specifies the node on which the command is run. If it is not specified, the command is run on all nodes of the cluster.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListInvocationResultsRequest build() {
            return new ListInvocationResultsRequest(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("Id")
        private String id;

        private Instance(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * The number of entries returned per page.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
