// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateIntantSiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateIntantSiteMonitorRequest</p>
 */
public class BatchCreateIntantSiteMonitorRequest extends Request {
    @Query
    @NameInMap("TaskList")
    @Validation(required = true)
    private java.util.List < TaskList> taskList;

    private BatchCreateIntantSiteMonitorRequest(Builder builder) {
        super(builder);
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateIntantSiteMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskList
     */
    public java.util.List < TaskList> getTaskList() {
        return this.taskList;
    }

    public static final class Builder extends Request.Builder<BatchCreateIntantSiteMonitorRequest, Builder> {
        private java.util.List < TaskList> taskList; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateIntantSiteMonitorRequest request) {
            super(request);
            this.taskList = request.taskList;
        } 

        /**
         * TaskList.
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.putQueryParameter("TaskList", taskList);
            this.taskList = taskList;
            return this;
        }

        @Override
        public BatchCreateIntantSiteMonitorRequest build() {
            return new BatchCreateIntantSiteMonitorRequest(this);
        } 

    } 

    public static class TaskList extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("IspCities")
        private String ispCities;

        @NameInMap("OptionsJson")
        private String optionsJson;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskType")
        private String taskType;

        private TaskList(Builder builder) {
            this.address = builder.address;
            this.ispCities = builder.ispCities;
            this.optionsJson = builder.optionsJson;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return ispCities
         */
        public String getIspCities() {
            return this.ispCities;
        }

        /**
         * @return optionsJson
         */
        public String getOptionsJson() {
            return this.optionsJson;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String address; 
            private String ispCities; 
            private String optionsJson; 
            private String taskName; 
            private String taskType; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * IspCities.
             */
            public Builder ispCities(String ispCities) {
                this.ispCities = ispCities;
                return this;
            }

            /**
             * OptionsJson.
             */
            public Builder optionsJson(String optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
