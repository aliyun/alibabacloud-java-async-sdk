// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SearchCloudGtmMonitorTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchCloudGtmMonitorTemplatesResponseBody</p>
 */
public class SearchCloudGtmMonitorTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private Templates templates;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private SearchCloudGtmMonitorTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCloudGtmMonitorTemplatesResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public Templates getTemplates() {
        return this.templates;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Templates templates; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(SearchCloudGtmMonitorTemplatesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.templates = model.templates;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The health check templates.</p>
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public SearchCloudGtmMonitorTemplatesResponseBody build() {
            return new SearchCloudGtmMonitorTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchCloudGtmMonitorTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmMonitorTemplatesResponseBody</p>
     */
    public static class IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        private IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNode create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private String countryCode; 
            private String countryName; 
            private String groupName; 
            private String groupType; 
            private String ispCode; 
            private String ispName; 

            private Builder() {
            } 

            private Builder(IspCityNode model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.countryCode = model.countryCode;
                this.countryName = model.countryName;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.ispCode = model.ispCode;
                this.ispName = model.ispName;
            } 

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * CountryName.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The group type of health check nodes. Valid values:</p>
             * <ul>
             * <li>BGP: BGP node</li>
             * <li>OVERSEAS: node outside the Chinese mainland</li>
             * <li>ISP: Internet service provider (ISP) node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * IspCode.
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public IspCityNode build() {
                return new IspCityNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchCloudGtmMonitorTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmMonitorTemplatesResponseBody</p>
     */
    public static class IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspCityNode")
        private java.util.List<IspCityNode> ispCityNode;

        private IspCityNodes(Builder builder) {
            this.ispCityNode = builder.ispCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return ispCityNode
         */
        public java.util.List<IspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

        public static final class Builder {
            private java.util.List<IspCityNode> ispCityNode; 

            private Builder() {
            } 

            private Builder(IspCityNodes model) {
                this.ispCityNode = model.ispCityNode;
            } 

            /**
             * IspCityNode.
             */
            public Builder ispCityNode(java.util.List<IspCityNode> ispCityNode) {
                this.ispCityNode = ispCityNode;
                return this;
            }

            public IspCityNodes build() {
                return new IspCityNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchCloudGtmMonitorTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmMonitorTemplatesResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("FailureRate")
        private Integer failureRate;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IspCityNodes")
        private IspCityNodes ispCityNodes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private Template(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.evaluationCount = builder.evaluationCount;
            this.extendInfo = builder.extendInfo;
            this.failureRate = builder.failureRate;
            this.interval = builder.interval;
            this.ipVersion = builder.ipVersion;
            this.ispCityNodes = builder.ispCityNodes;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.remark = builder.remark;
            this.templateId = builder.templateId;
            this.timeout = builder.timeout;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return evaluationCount
         */
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return failureRate
         */
        public Integer getFailureRate() {
            return this.failureRate;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return ispCityNodes
         */
        public IspCityNodes getIspCityNodes() {
            return this.ispCityNodes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private Integer evaluationCount; 
            private String extendInfo; 
            private Integer failureRate; 
            private Integer interval; 
            private String ipVersion; 
            private IspCityNodes ispCityNodes; 
            private String name; 
            private String protocol; 
            private String remark; 
            private String templateId; 
            private Integer timeout; 
            private String updateTime; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.evaluationCount = model.evaluationCount;
                this.extendInfo = model.extendInfo;
                this.failureRate = model.failureRate;
                this.interval = model.interval;
                this.ipVersion = model.ipVersion;
                this.ispCityNodes = model.ispCityNodes;
                this.name = model.name;
                this.protocol = model.protocol;
                this.remark = model.remark;
                this.templateId = model.templateId;
                this.timeout = model.timeout;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>The extended information. The value of this parameter is a JSON string. The required parameters vary based on the health check protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>http(s)</strong>:</p>
             * <p><strong>host</strong>: indicates the Host field of an HTTP or HTTPS request header during an HTTP or HTTPS health check. The parameter value indicates the HTTP website that you want to visit. By default, the value is the primary domain name. You can change the value based on your business requirements.</p>
             * <p><strong>path</strong>: the URL for HTTP or HTTPS health checks. Default value: /.</p>
             * <p><strong>code</strong>: indicates the alert threshold. During an HTTP or HTTPS health check, the system checks whether a web server functions as expected based on the status code that is returned from the web server. If the returned status code is greater than the specified threshold, the corresponding application service address is deemed abnormal. Valid values:</p>
             * <ul>
             * <li>400: indicates an invalid request. If an HTTP or HTTPS request contains invalid request parameters, a web server returns a status code that is greater than 400. If Verification Content is set to &quot;The error code is greater than 400&quot;, you must specify an exact URL for the path parameter.</li>
             * <li>500: indicates a server error. If some exceptions occur on a web server, the web server returns a status code that is greater than 500. The error code that is greater than 500 is used as the alert threshold by default.</li>
             * </ul>
             * <p><strong>sni</strong>: indicates whether Server Name Indication (SNI) is enabled for HTTPS. SNI is an extension to the Transport Layer Security (TLS) protocol, which allows a client to specify the host to be connected when the client sends a TLS handshake request. TLS handshakes occur before any data of HTTP requests is sent. Therefore, SNI enables servers to identify the services that clients are attempting to access before certificates are sent. This allows the servers to present correct certificates to the clients. Valid values:</p>
             * <ul>
             * <li>true: SNI is enabled.</li>
             * <li>false: SNI is disabled.</li>
             * </ul>
             * <p><strong>followRedirect</strong>: indicates whether 3XX redirection is followed. Valid values:</p>
             * <ul>
             * <li>true: You are redirected to the destination address if a status code 3XX, such as 301, 302, 303, 307, or 308, is returned.</li>
             * <li>false: You are not redirected to the destination address.</li>
             * </ul>
             * </li>
             * <li><p><strong>ping</strong>:</p>
             * <p><strong>packetNum</strong>: The total number of Internet Control Message Protocol (ICMP) packets that are sent to the address for each ping-based health check. Valid values: 20, 50, and 100.</p>
             * <p><strong>packetLossRate</strong>: The packet loss rate for each ping-based health check. The packet loss rate in a check can be calculated by using the following formula: Packet loss rate = (Number of lost packets/Total number of sent ICMP packets) × 100%. If the packet loss rate reaches the threshold, an alert is triggered. Valid values: 10, 30, 40, 80, 90, and 100.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;code&quot;:200,&quot;path&quot;:&quot;\index.htm&quot;,&quot;host&quot;:&quot;aliyun.com&quot;}</p>
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * FailureRate.
             */
            public Builder failureRate(Integer failureRate) {
                this.failureRate = failureRate;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The IP address type of health check nodes. Valid values:</p>
             * <ul>
             * <li>IPv4: applicable when the destination address of health checks is an IPv4 address</li>
             * <li>IPv6: applicable when the destination address of health checks is an IPv6 address</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The health check nodes.</p>
             */
            public Builder ispCityNodes(IspCityNodes ispCityNodes) {
                this.ispCityNodes = ispCityNodes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchCloudGtmMonitorTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmMonitorTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List<Template> template;

        private Templates(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List<Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List<Template> template; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.template = model.template;
            } 

            /**
             * Template.
             */
            public Builder template(java.util.List<Template> template) {
                this.template = template;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
