// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateSiteDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSiteDeliveryTaskResponseBody</p>
 */
public class CreateSiteDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateSiteDeliveryTaskResponseBody(Builder builder) {
        this.dataCenter = builder.dataCenter;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteDeliveryTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String dataCenter; 
        private String requestId; 
        private Long siteId; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(CreateSiteDeliveryTaskResponseBody model) {
            this.dataCenter = model.dataCenter;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li>cn: the Chinese mainland.</li>
         * <li>oversea: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9358E852-992D-5BC7-8BD7-975CA02773A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.<a href="~~2850189~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The name of the delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>er-oss</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateSiteDeliveryTaskResponseBody build() {
            return new CreateSiteDeliveryTaskResponseBody(this);
        } 

    } 

}
