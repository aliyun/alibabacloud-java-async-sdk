// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnosisResponseBody</p>
 */
public class ListDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListDiagnosisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListDiagnosisResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.total = model.total;
        } 

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>44841312-7227-55C9-AE03-D59729BFAE38</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><code>code == Success</code> indicates that the authorization is successful.</li>
         * <li>Other status codes indicate authorization failed. Check the <code>message</code> field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error message.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>319</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListDiagnosisResponseBody build() {
            return new ListDiagnosisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDiagnosisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnosisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("command")
        private Object command;

        @com.aliyun.core.annotation.NameInMap("created_at")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("err_msg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("result")
        private Object result;

        @com.aliyun.core.annotation.NameInMap("service_name")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("updated_at")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.code = builder.code;
            this.command = builder.command;
            this.createdAt = builder.createdAt;
            this.errMsg = builder.errMsg;
            this.params = builder.params;
            this.result = builder.result;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.updatedAt = builder.updatedAt;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return command
         */
        public Object getCommand() {
            return this.command;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return result
         */
        public Object getResult() {
            return this.result;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer code; 
            private Object command; 
            private String createdAt; 
            private String errMsg; 
            private Object params; 
            private Object result; 
            private String serviceName; 
            private String status; 
            private String taskId; 
            private String updatedAt; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.command = model.command;
                this.createdAt = model.createdAt;
                this.errMsg = model.errMsg;
                this.params = model.params;
                this.result = model.result;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.taskId = model.taskId;
                this.updatedAt = model.updatedAt;
                this.url = model.url;
            } 

            /**
             * <p>The diagnostic error code. A value of 0 indicates no error.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The diagnostic command.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;jobs&quot;:[
             *         {
             *             &quot;cmd&quot;:&quot;mkdir -p /var/log/sysak &amp;&amp; sysak podmem -r 100  -a -j /var/log/sysak/podmem.json &gt; /dev/null 2&gt;&amp;1 &amp;&amp; cat /var/log/sysak/podmem.json&quot;,
             *             &quot;instance&quot;:&quot;172.20.12.174&quot;,
             *             &quot;fetch_file_list&quot;:[</p>
             * <pre><code>        ]
             *     }
             * ],
             * &quot;in_order&quot;:true,
             * &quot;offline_mode&quot;:false,
             * &quot;offline_results&quot;:[
             * 
             * ]
             * </code></pre>
             * <p>}</p>
             */
            public Builder command(Object command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-25T15:08:19</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Diagnosis failed</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The diagnostic parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;type&quot;:&quot;all&quot;,
             *     &quot;value&quot;:&quot;&quot;,
             *     &quot;channel&quot;:&quot;ssh&quot;,
             *     &quot;instance&quot;:&quot;172.1.2.174&quot;,
             *     &quot;service_name&quot;:&quot;filecache&quot;
             * }</p>
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The diagnostic result.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;summary&quot;:&quot;  memory cgroup leak&quot;,
             *     &quot;dataMemEvent&quot;:{
             *         &quot;data&quot;:[
             *             {
             *                 &quot;key&quot;:&quot;Util&quot;,
             *                 &quot;value&quot;:20
             *             },
             *             {
             *                 &quot;key&quot;:&quot;MemLeak&quot;,
             *                 &quot;value&quot;:&quot;OK&quot;
             *             },
             *             {
             *                 &quot;key&quot;:&quot;MemcgLeak&quot;,
             *                 &quot;value&quot;:&quot;NG&quot;
             *             },
             *             {
             *                 &quot;key&quot;:&quot;MemFrag&quot;,
             *                 &quot;value&quot;:&quot;OK&quot;
             *             }
             *         ]
             *     },
             *     &quot;dataMemOverView&quot;:{
             *         &quot;data&quot;:[
             *             {
             *                 &quot;key&quot;:&quot;app&quot;,
             *                 &quot;value&quot;:10937332
             *             },
             *             {
             *                 &quot;key&quot;:&quot;free&quot;,
             *                 &quot;value&quot;:806800
             *             },
             *             {
             *                 &quot;key&quot;:&quot;kernel&quot;,
             *                 &quot;value&quot;:4527660
             *             }
             *         ]
             *     },
             *     &quot;dataKerMem&quot;:{
             *         &quot;data&quot;:[
             *             {
             *                 &quot;key&quot;:&quot;SReclaimable&quot;,
             *                 &quot;value&quot;:3411292
             *             },
             *             {
             *                 &quot;key&quot;:&quot;VmallocUsed&quot;,
             *                 &quot;value&quot;:30980
             *             },
             *             {
             *                 &quot;key&quot;:&quot;allocPage&quot;,
             *                 &quot;value&quot;:177732
             *             },
             *             {
             *                 &quot;key&quot;:&quot;KernelStack&quot;,
             *                 &quot;value&quot;:9280
             *             },
             *             {
             *                 &quot;key&quot;:&quot;PageTables&quot;,
             *                 &quot;value&quot;:38056
             *             },
             *             {
             *                 &quot;key&quot;:&quot;SUnreclaim&quot;,
             *                 &quot;value&quot;:170248
             *             },
             *             {
             *                 &quot;key&quot;:&quot;reserved&quot;,
             *                 &quot;value&quot;:690072
             *             }
             *         ]
             *     },
             *     &quot;dataUserMem&quot;:{
             *         &quot;data&quot;:[
             *             {
             *                 &quot;key&quot;:&quot;filecache&quot;,
             *                 &quot;value&quot;:8010008
             *             },
             *             {
             *                 &quot;key&quot;:&quot;anon&quot;,
             *                 &quot;value&quot;:2468608
             *             },
             *             {
             *                 &quot;key&quot;:&quot;mlock&quot;,
             *                 &quot;value&quot;:0
             *             },
             *             {
             *                 &quot;key&quot;:&quot;huge1G&quot;,
             *                 &quot;value&quot;:0
             *             },
             *             {
             *                 &quot;key&quot;:&quot;huge2M&quot;,
             *                 &quot;value&quot;:0
             *             },
             *             {
             *                 &quot;key&quot;:&quot;buffers&quot;,
             *                 &quot;value&quot;:458608
             *             },
             *             {
             *                 &quot;key&quot;:&quot;shmem&quot;,
             *                 &quot;value&quot;:2284
             *             }
             *         ]
             *     },
             *     &quot;dataCacheList&quot;:{
             *         &quot;data&quot;:[
             *             {
             *                 &quot;key&quot;:0,
             *                 &quot;Name&quot;:&quot;/var/lib/mysql/sysom/sys_handler_log.ibd&quot;,
             *                 &quot;cached&quot;:576764,
             *                 &quot;Task&quot;:&quot;mysqld_78575 &quot;
             *             },
             *             {
             *                 &quot;key&quot;:1,
             *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-migration-access.log&quot;,
             *                 &quot;cached&quot;:276688,
             *                 &quot;Task&quot;:&quot;gunicorn_33647 ,gunicorn_460836 ,gunicorn_559934 ,gunicorn_731758 ,gunicorn_2362682 &quot;
             *             },
             *             {
             *                 &quot;key&quot;:2,
             *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-rtdemo-access.log&quot;,
             *                 &quot;cached&quot;:229404,
             *                 &quot;Task&quot;:&quot;gunicorn_60718 ,gunicorn_720734 ,gunicorn_722168 &quot;
             *             },
             *             {
             *                 &quot;key&quot;:3,
             *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-monitor-server-access.log&quot;,
             *                 &quot;cached&quot;:197368,
             *                 &quot;Task&quot;:&quot;gunicorn_33682 ,gunicorn_671155 ,gunicorn_714998 &quot;
             *             },
             *             {
             *                 &quot;key&quot;:4,
             *                 &quot;Name&quot;:&quot;/var/log/sysom/sysom-channel-access.log&quot;,
             *                 &quot;cached&quot;:180276,
             *                 &quot;Task&quot;:&quot;gunicorn_33233 ,gunicorn_499735 ,gunicorn_725497 &quot;
             *             },
             *             {
             *                 &quot;key&quot;:5,
             *                 &quot;Name&quot;:&quot;total cached of close file&quot;,
             *                 &quot;cached&quot;:3729668,
             *                 &quot;Task&quot;:&quot;&quot;
             *             }
             *         ]
             *     },
             *     &quot;dataProcMemList&quot;:{
             *         &quot;data&quot;:[
             *             {
             *                 &quot;key&quot;:0,
             *                 &quot;task&quot;:&quot;mysqld&quot;,
             *                 &quot;MemTotal&quot;:240856,
             *                 &quot;RssAnon&quot;:218248,
             *                 &quot;RssFile&quot;:22608
             *             },
             *             {
             *                 &quot;key&quot;:1,
             *                 &quot;task&quot;:&quot;systemd-journal&quot;,
             *                 &quot;MemTotal&quot;:150248,
             *                 &quot;RssAnon&quot;:74300,
             *                 &quot;RssFile&quot;:75944
             *             },
             *             {
             *                 &quot;key&quot;:2,
             *                 &quot;task&quot;:&quot;gunicorn&quot;,
             *                 &quot;MemTotal&quot;:144640,
             *                 &quot;RssAnon&quot;:114200,
             *                 &quot;RssFile&quot;:30440
             *             },
             *             {
             *                 &quot;key&quot;:3,
             *                 &quot;task&quot;:&quot;gunicorn&quot;,
             *                 &quot;MemTotal&quot;:141480,
             *                 &quot;RssAnon&quot;:111040,
             *                 &quot;RssFile&quot;:30440
             *             },
             *             {
             *                 &quot;key&quot;:4,
             *                 &quot;task&quot;:&quot;grafana-server&quot;,
             *                 &quot;MemTotal&quot;:103660,
             *                 &quot;RssAnon&quot;:42732,
             *                 &quot;RssFile&quot;:60928
             *             },
             *             {
             *                 &quot;key&quot;:5,
             *                 &quot;task&quot;:&quot;gunicorn&quot;,
             *                 &quot;MemTotal&quot;:97444,
             *                 &quot;RssAnon&quot;:76256,
             *                 &quot;RssFile&quot;:21188
             *             },
             *             {
             *                 &quot;key&quot;:6,
             *                 &quot;task&quot;:&quot;gunicorn&quot;,
             *                 &quot;MemTotal&quot;:97260,
             *                 &quot;RssAnon&quot;:76072,
             *                 &quot;RssFile&quot;:21188
             *             },
             *             {
             *                 &quot;key&quot;:7,
             *                 &quot;task&quot;:&quot;prometheus&quot;,
             *                 &quot;MemTotal&quot;:95356,
             *                 &quot;RssAnon&quot;:45376,
             *                 &quot;RssFile&quot;:49980
             *             },
             *             {
             *                 &quot;key&quot;:8,
             *                 &quot;task&quot;:&quot;gunicorn&quot;,
             *                 &quot;MemTotal&quot;:90144,
             *                 &quot;RssAnon&quot;:76456,
             *                 &quot;RssFile&quot;:13688
             *             },
             *             {
             *                 &quot;key&quot;:9,
             *                 &quot;task&quot;:&quot;gunicorn&quot;,
             *                 &quot;MemTotal&quot;:89796,
             *                 &quot;RssAnon&quot;:76108,
             *                 &quot;RssFile&quot;:13688
             *             }
             *         ]
             *     }
             * }</p>
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The diagnostic type.</p>
             * 
             * <strong>example:</strong>
             * <p>memgraph</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The execution status of the diagnostic task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>Ready</strong>: Ready.</li>
             * <li><strong>Running</strong>: Running.</li>
             * <li><strong>Success</strong>: Succeeded.</li>
             * <li><strong>Fail</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>grcuU21a</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-25T15:08:19</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The URL of the diagnostic details.</p>
             * 
             * <strong>example:</strong>
             * <p>/diagnose/detail/qe3Z34sa</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
