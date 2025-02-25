// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchCreateInstantSiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateInstantSiteMonitorRequest</p>
 */
public class BatchCreateInstantSiteMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < TaskList> taskList;

    private BatchCreateInstantSiteMonitorRequest(Builder builder) {
        super(builder);
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateInstantSiteMonitorRequest create() {
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

    public static final class Builder extends Request.Builder<BatchCreateInstantSiteMonitorRequest, Builder> {
        private java.util.List < TaskList> taskList; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateInstantSiteMonitorRequest request) {
            super(request);
            this.taskList = request.taskList;
        } 

        /**
         * <p>The site monitoring tasks.</p>
         * <blockquote>
         * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.putQueryParameter("TaskList", taskList);
            this.taskList = taskList;
            return this;
        }

        @Override
        public BatchCreateInstantSiteMonitorRequest build() {
            return new BatchCreateInstantSiteMonitorRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateInstantSiteMonitorRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateInstantSiteMonitorRequest</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("IspCities")
        private String ispCities;

        @com.aliyun.core.annotation.NameInMap("OptionsJson")
        private String optionsJson;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
             * <p>The URL or IP address that is monitored by the task.</p>
             * <blockquote>
             * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
             * <p>The value is a <code>JSON array</code>. Example: <code>{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}</code>. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
             * <p>For information about how to obtain detection points, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
             */
            public Builder ispCities(String ispCities) {
                this.ispCities = ispCities;
                return this;
            }

            /**
             * <p>The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;time_out&quot;:5000}</p>
             */
            public Builder optionsJson(String optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * <p>The name of the site monitoring task.</p>
             * <p>The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (_).</p>
             * <blockquote>
             * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HangZhou_ECS1</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the site monitoring task.</p>
             * <p>Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
             * <blockquote>
             * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
