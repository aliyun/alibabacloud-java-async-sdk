// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendCustomEventRequest} extends {@link RequestModel}
 *
 * <p>SendCustomEventRequest</p>
 */
public class SendCustomEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private String dataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventDescription")
    private String eventDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventDetails")
    private String eventDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FindTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long findTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsSend")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isSend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    @com.aliyun.core.annotation.Validation(required = true)
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
    private Long occurrenceTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniqueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private SendCustomEventRequest(Builder builder) {
        super(builder);
        this.customerId = builder.customerId;
        this.dataSource = builder.dataSource;
        this.eventDescription = builder.eventDescription;
        this.eventDetails = builder.eventDetails;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.findTime = builder.findTime;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isSend = builder.isSend;
        this.level = builder.level;
        this.occurrenceTime = builder.occurrenceTime;
        this.ownerId = builder.ownerId;
        this.product = builder.product;
        this.uniqueId = builder.uniqueId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCustomEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return eventDescription
     */
    public String getEventDescription() {
        return this.eventDescription;
    }

    /**
     * @return eventDetails
     */
    public String getEventDetails() {
        return this.eventDetails;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return findTime
     */
    public Long getFindTime() {
        return this.findTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isSend
     */
    public String getIsSend() {
        return this.isSend;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return occurrenceTime
     */
    public Long getOccurrenceTime() {
        return this.occurrenceTime;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<SendCustomEventRequest, Builder> {
        private String customerId; 
        private String dataSource; 
        private String eventDescription; 
        private String eventDetails; 
        private String eventName; 
        private String eventType; 
        private Long findTime; 
        private String instanceId; 
        private String instanceName; 
        private String isSend; 
        private String level; 
        private Long occurrenceTime; 
        private String ownerId; 
        private String product; 
        private String uniqueId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(SendCustomEventRequest request) {
            super(request);
            this.customerId = request.customerId;
            this.dataSource = request.dataSource;
            this.eventDescription = request.eventDescription;
            this.eventDetails = request.eventDetails;
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.findTime = request.findTime;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.isSend = request.isSend;
            this.level = request.level;
            this.occurrenceTime = request.occurrenceTime;
            this.ownerId = request.ownerId;
            this.product = request.product;
            this.uniqueId = request.uniqueId;
            this.uuid = request.uuid;
        } 

        /**
         * <p>User ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1214484929940219</p>
         */
        public Builder customerId(String customerId) {
            this.putBodyParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>Data source.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_suspicious_event</p>
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>Event details.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似病毒木马启动运行。</p>
         */
        public Builder eventDescription(String eventDescription) {
            this.putBodyParameter("EventDescription", eventDescription);
            this.eventDescription = eventDescription;
            return this;
        }

        /**
         * <p>Alert event details.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;提示&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;在您的系统上发现可疑进程启动行为，通常与病毒木马或入侵事件相关&quot;},{&quot;name&quot;:&quot;ATT&amp;CK攻击阶段&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;代码执行&quot;},{&quot;name&quot;:&quot;恶意行为&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;可疑的漏洞利用代码执行&quot;},{&quot;name&quot;:&quot;规则类型&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;进程启动&quot;},{&quot;name&quot;:&quot;规则引擎&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;精准攻击识别引擎&quot;},{&quot;name&quot;:&quot;处置动作&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;阻断行为&quot;},{&quot;name&quot;:&quot;进程路径&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;/usr/bin/python3.9&quot;},{&quot;name&quot;:&quot;命令行&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;python3 /root/poc/python/cve-2018-15473.py --username root --port 22&quot;},{&quot;name&quot;:&quot;父进程路径&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;/bin/gunkit&quot;},{&quot;name&quot;:&quot;父进程命令行&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;gunkit serve-grpc --addr unix:///data/gunkit-grpc.sock&quot;},{&quot;name&quot;:&quot;进程ID&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;22714&quot;},{&quot;name&quot;:&quot;父进程ID&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;2986&quot;},{&quot;name&quot;:&quot;描述&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;主动防御检测到可疑进程启动行为，这类可疑进程通常存在于特殊的系统目录，或通过后缀伪装成文档/音频/图片等文件诱导用户运行，该异常行为已被成功拦截&quot;},{&quot;name&quot;:&quot;处置建议&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;请您及时排查是否是正常的业务操作，如果您觉得此次拦截是非预期的，那您可以在主动防御 - 恶意行为防御页面中，关闭“可疑进程启动“规则集或者将受影响机器从管理主机中移除&quot;},{&quot;name&quot;:&quot;父进程关系&quot;,&quot;type&quot;:&quot;processChain&quot;,&quot;value&quot;:&quot;1:::/usr/lib/systemd/systemd --switched-root --system --deserialize 22 &amp;&amp;&amp; 2939:::/usr/local/bin/containerd-shim-runc-v2 -namespace moby -id 270f164903b47d4e219b410b8d11d9079a7ad1bac8133aea604598300d3b03d5 -address /run/containerd/containerd.sock &amp;&amp;&amp; 2962:::/usr/bin/python3 /usr/bin/supervisord -n &amp;&amp;&amp; 2986:::gunkit serve-grpc --addr unix:///data/gunkit-grpc.sock&quot;}]</p>
         */
        public Builder eventDetails(String eventDetails) {
            this.putBodyParameter("EventDetails", eventDetails);
            this.eventDetails = eventDetails;
            return this;
        }

        /**
         * <p>Event name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>客户端离线</p>
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>Event type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUSP_CUSTOM_CFW</p>
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>Alert discovery time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 14:47:34</p>
         */
        public Builder findTime(Long findTime) {
            this.putBodyParameter("FindTime", findTime);
            this.findTime = findTime;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf60h3ns25bzq9eyf8ps</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>猫吉-售卖-MDR扫描器集群1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Whether to send.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isSend(String isSend) {
            this.putBodyParameter("IsSend", isSend);
            this.isSend = isSend;
            return this;
        }

        /**
         * <p>Event level.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The first occurrence time of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>1724956996000</p>
         */
        public Builder occurrenceTime(Long occurrenceTime) {
            this.putBodyParameter("OccurrenceTime", occurrenceTime);
            this.occurrenceTime = occurrenceTime;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putBodyParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Product name.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudSecCenter</p>
         */
        public Builder product(String product) {
            this.putBodyParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>Unique ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68888f02-98f2-492b-a2b2-5b13295755b7</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putBodyParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        /**
         * <p>UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>93B6CDAB-7D2E-33D2-9EBA-25D561A2E95F</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public SendCustomEventRequest build() {
            return new SendCustomEventRequest(this);
        } 

    } 

}
