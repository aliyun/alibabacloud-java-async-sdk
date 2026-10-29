// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
    private java.util.List<TaskList> taskList;

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
    public java.util.List<TaskList> getTaskList() {
        return this.taskList;
    }

    public static final class Builder extends Request.Builder<BatchCreateInstantSiteMonitorRequest, Builder> {
        private java.util.List<TaskList> taskList; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateInstantSiteMonitorRequest request) {
            super(request);
            this.taskList = request.taskList;
        } 

        /**
         * <p>The list of site monitoring tasks.</p>
         * <blockquote>
         * <p>You must create at least one site monitoring task, and you must specify <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
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

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.address = model.address;
                this.ispCities = model.ispCities;
                this.optionsJson = model.optionsJson;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The URL or IP address of the site monitoring task.</p>
             * <blockquote>
             * <p>You must create at least one site monitoring task, and you must specify <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code>.</p>
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
             * <p>The detection point information. If this parameter is left empty, the system randomly selects three detection points.</p>
             * <p>The value is a JSON array. Example: <code>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</code>. The values correspond to Beijing, Hangzhou, and Qingdao.</p>
             * <p>For more information about how to obtain detection point information, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
             */
            public Builder ispCities(String ispCities) {
                this.ispCities = ispCities;
                return this;
            }

            /**
             * <p>The advanced extension options for the protocol type of the site monitoring task. Different protocol types correspond to different extension options.</p>
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
             * <p>&lt;props=&quot;china&quot;&gt;The name must be 4 to 100 characters in length and can contain letters, digits, underscores (_), and Chinese characters.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
             * <p>&lt;props=&quot;partner&quot;&gt;The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
             * <blockquote>
             * <p>You must create at least one site monitoring task, and you must specify <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code>.</p>
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
             * <p>The monitoring type of the site monitoring task.</p>
             * <p>Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
             * <blockquote>
             * <p>You must create at least one site monitoring task, and you must specify <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code>.</p>
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
