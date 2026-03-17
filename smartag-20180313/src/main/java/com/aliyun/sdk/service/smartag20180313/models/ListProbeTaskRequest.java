// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListProbeTaskRequest} extends {@link RequestModel}
 *
 * <p>ListProbeTaskRequest</p>
 */
public class ListProbeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeTaskId")
    private String probeTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagId")
    private String sagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagName")
    private String sagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private ListProbeTaskRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.probeTaskId = builder.probeTaskId;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.sagId = builder.sagId;
        this.sagName = builder.sagName;
        this.sn = builder.sn;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProbeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return probeTaskId
     */
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagId
     */
    public String getSagId() {
        return this.sagId;
    }

    /**
     * @return sagName
     */
    public String getSagName() {
        return this.sagName;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<ListProbeTaskRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String probeTaskId; 
        private String protocol; 
        private String regionId; 
        private String sagId; 
        private String sagName; 
        private String sn; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(ListProbeTaskRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.probeTaskId = request.probeTaskId;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.sagId = request.sagId;
            this.sagName = request.sagName;
            this.sn = request.sn;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>probe-****</p>
         */
        public Builder probeTaskId(String probeTaskId) {
            this.putQueryParameter("ProbeTaskId", probeTaskId);
            this.probeTaskId = probeTaskId;
            return this;
        }

        /**
         * <p>The protocol of the probe task. Valid values:</p>
         * <ul>
         * <li><strong>ICMP</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>HTTP</strong></li>
         * </ul>
         * <blockquote>
         * <p> Tasks that probe private networks support only ICMP and TCP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ICMP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-****</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        /**
         * <p>The name of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai-office</p>
         */
        public Builder sagName(String sagName) {
            this.putQueryParameter("SagName", sagName);
            this.sagName = sagName;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag****</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * <p>The name of the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ping</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public ListProbeTaskRequest build() {
            return new ListProbeTaskRequest(this);
        } 

    } 

}
