// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetPADiagnosisTaskResponseBody</p>
 */
public class GetPADiagnosisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosisTask")
    private DiagnosisTask diagnosisTask;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPADiagnosisTaskResponseBody(Builder builder) {
        this.diagnosisTask = builder.diagnosisTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPADiagnosisTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosisTask
     */
    public DiagnosisTask getDiagnosisTask() {
        return this.diagnosisTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiagnosisTask diagnosisTask; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPADiagnosisTaskResponseBody model) {
            this.diagnosisTask = model.diagnosisTask;
            this.requestId = model.requestId;
        } 

        /**
         * DiagnosisTask.
         */
        public Builder diagnosisTask(DiagnosisTask diagnosisTask) {
            this.diagnosisTask = diagnosisTask;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPADiagnosisTaskResponseBody build() {
            return new GetPADiagnosisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class GeoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Prov")
        private String prov;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        private GeoData(Builder builder) {
            this.country = builder.country;
            this.prov = builder.prov;
            this.city = builder.city;
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeoData create() {
            return builder().build();
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return prov
         */
        public String getProv() {
            return this.prov;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private String country; 
            private String prov; 
            private String city; 
            private String isp; 

            private Builder() {
            } 

            private Builder(GeoData model) {
                this.country = model.country;
                this.prov = model.prov;
                this.city = model.city;
                this.isp = model.isp;
            } 

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Prov.
             */
            public Builder prov(String prov) {
                this.prov = prov;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            public GeoData build() {
                return new GeoData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class Hops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private String TTL;

        @com.aliyun.core.annotation.NameInMap("Latency")
        private String latency;

        @com.aliyun.core.annotation.NameInMap("GeoData")
        private GeoData geoData;

        private Hops(Builder builder) {
            this.address = builder.address;
            this.TTL = builder.TTL;
            this.latency = builder.latency;
            this.geoData = builder.geoData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hops create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return TTL
         */
        public String getTTL() {
            return this.TTL;
        }

        /**
         * @return latency
         */
        public String getLatency() {
            return this.latency;
        }

        /**
         * @return geoData
         */
        public GeoData getGeoData() {
            return this.geoData;
        }

        public static final class Builder {
            private String address; 
            private String TTL; 
            private String latency; 
            private GeoData geoData; 

            private Builder() {
            } 

            private Builder(Hops model) {
                this.address = model.address;
                this.TTL = model.TTL;
                this.latency = model.latency;
                this.geoData = model.geoData;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>TTL。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder TTL(String TTL) {
                this.TTL = TTL;
                return this;
            }

            /**
             * Latency.
             */
            public Builder latency(String latency) {
                this.latency = latency;
                return this;
            }

            /**
             * GeoData.
             */
            public Builder geoData(GeoData geoData) {
                this.geoData = geoData;
                return this;
            }

            public Hops build() {
                return new Hops(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class Dns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private String dnsServer;

        @com.aliyun.core.annotation.NameInMap("DnsType")
        private String dnsType;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("FromNode")
        private Long fromNode;

        @com.aliyun.core.annotation.NameInMap("Hops")
        private java.util.List<java.util.List<Hops>> hops;

        @com.aliyun.core.annotation.NameInMap("Latency")
        private String latency;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("ToNode")
        private Long toNode;

        private Dns(Builder builder) {
            this.dnsServer = builder.dnsServer;
            this.dnsType = builder.dnsType;
            this.error = builder.error;
            this.fromNode = builder.fromNode;
            this.hops = builder.hops;
            this.latency = builder.latency;
            this.result = builder.result;
            this.success = builder.success;
            this.toNode = builder.toNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dns create() {
            return builder().build();
        }

        /**
         * @return dnsServer
         */
        public String getDnsServer() {
            return this.dnsServer;
        }

        /**
         * @return dnsType
         */
        public String getDnsType() {
            return this.dnsType;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return fromNode
         */
        public Long getFromNode() {
            return this.fromNode;
        }

        /**
         * @return hops
         */
        public java.util.List<java.util.List<Hops>> getHops() {
            return this.hops;
        }

        /**
         * @return latency
         */
        public String getLatency() {
            return this.latency;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return toNode
         */
        public Long getToNode() {
            return this.toNode;
        }

        public static final class Builder {
            private String dnsServer; 
            private String dnsType; 
            private String error; 
            private Long fromNode; 
            private java.util.List<java.util.List<Hops>> hops; 
            private String latency; 
            private String result; 
            private Boolean success; 
            private Long toNode; 

            private Builder() {
            } 

            private Builder(Dns model) {
                this.dnsServer = model.dnsServer;
                this.dnsType = model.dnsType;
                this.error = model.error;
                this.fromNode = model.fromNode;
                this.hops = model.hops;
                this.latency = model.latency;
                this.result = model.result;
                this.success = model.success;
                this.toNode = model.toNode;
            } 

            /**
             * DnsServer.
             */
            public Builder dnsServer(String dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            /**
             * DnsType.
             */
            public Builder dnsType(String dnsType) {
                this.dnsType = dnsType;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * FromNode.
             */
            public Builder fromNode(Long fromNode) {
                this.fromNode = fromNode;
                return this;
            }

            /**
             * Hops.
             */
            public Builder hops(java.util.List<java.util.List<Hops>> hops) {
                this.hops = hops;
                return this;
            }

            /**
             * Latency.
             */
            public Builder latency(String latency) {
                this.latency = latency;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * ToNode.
             */
            public Builder toNode(Long toNode) {
                this.toNode = toNode;
                return this;
            }

            public Dns build() {
                return new Dns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class HopsGeoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Prov")
        private String prov;

        private HopsGeoData(Builder builder) {
            this.city = builder.city;
            this.country = builder.country;
            this.isp = builder.isp;
            this.prov = builder.prov;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HopsGeoData create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return prov
         */
        public String getProv() {
            return this.prov;
        }

        public static final class Builder {
            private String city; 
            private String country; 
            private String isp; 
            private String prov; 

            private Builder() {
            } 

            private Builder(HopsGeoData model) {
                this.city = model.city;
                this.country = model.country;
                this.isp = model.isp;
                this.prov = model.prov;
            } 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Prov.
             */
            public Builder prov(String prov) {
                this.prov = prov;
                return this;
            }

            public HopsGeoData build() {
                return new HopsGeoData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class LinksHops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("GeoData")
        private HopsGeoData geoData;

        @com.aliyun.core.annotation.NameInMap("Latency")
        private String latency;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private String TTL;

        private LinksHops(Builder builder) {
            this.address = builder.address;
            this.geoData = builder.geoData;
            this.latency = builder.latency;
            this.TTL = builder.TTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinksHops create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return geoData
         */
        public HopsGeoData getGeoData() {
            return this.geoData;
        }

        /**
         * @return latency
         */
        public String getLatency() {
            return this.latency;
        }

        /**
         * @return TTL
         */
        public String getTTL() {
            return this.TTL;
        }

        public static final class Builder {
            private String address; 
            private HopsGeoData geoData; 
            private String latency; 
            private String TTL; 

            private Builder() {
            } 

            private Builder(LinksHops model) {
                this.address = model.address;
                this.geoData = model.geoData;
                this.latency = model.latency;
                this.TTL = model.TTL;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * GeoData.
             */
            public Builder geoData(HopsGeoData geoData) {
                this.geoData = geoData;
                return this;
            }

            /**
             * Latency.
             */
            public Builder latency(String latency) {
                this.latency = latency;
                return this;
            }

            /**
             * <p>TTL。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder TTL(String TTL) {
                this.TTL = TTL;
                return this;
            }

            public LinksHops build() {
                return new LinksHops(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class Links extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("FromNode")
        private Long fromNode;

        @com.aliyun.core.annotation.NameInMap("Hops")
        private java.util.List<LinksHops> hops;

        @com.aliyun.core.annotation.NameInMap("Latency")
        private String latency;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("ToNode")
        private Long toNode;

        private Links(Builder builder) {
            this.error = builder.error;
            this.fromNode = builder.fromNode;
            this.hops = builder.hops;
            this.latency = builder.latency;
            this.success = builder.success;
            this.toNode = builder.toNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return fromNode
         */
        public Long getFromNode() {
            return this.fromNode;
        }

        /**
         * @return hops
         */
        public java.util.List<LinksHops> getHops() {
            return this.hops;
        }

        /**
         * @return latency
         */
        public String getLatency() {
            return this.latency;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return toNode
         */
        public Long getToNode() {
            return this.toNode;
        }

        public static final class Builder {
            private String error; 
            private Long fromNode; 
            private java.util.List<LinksHops> hops; 
            private String latency; 
            private Boolean success; 
            private Long toNode; 

            private Builder() {
            } 

            private Builder(Links model) {
                this.error = model.error;
                this.fromNode = model.fromNode;
                this.hops = model.hops;
                this.latency = model.latency;
                this.success = model.success;
                this.toNode = model.toNode;
            } 

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * FromNode.
             */
            public Builder fromNode(Long fromNode) {
                this.fromNode = fromNode;
                return this;
            }

            /**
             * Hops.
             */
            public Builder hops(java.util.List<LinksHops> hops) {
                this.hops = hops;
                return this;
            }

            /**
             * Latency.
             */
            public Builder latency(String latency) {
                this.latency = latency;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * ToNode.
             */
            public Builder toNode(Long toNode) {
                this.toNode = toNode;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class NodesGeoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Prov")
        private String prov;

        private NodesGeoData(Builder builder) {
            this.city = builder.city;
            this.country = builder.country;
            this.isp = builder.isp;
            this.prov = builder.prov;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodesGeoData create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return prov
         */
        public String getProv() {
            return this.prov;
        }

        public static final class Builder {
            private String city; 
            private String country; 
            private String isp; 
            private String prov; 

            private Builder() {
            } 

            private Builder(NodesGeoData model) {
                this.city = model.city;
                this.country = model.country;
                this.isp = model.isp;
                this.prov = model.prov;
            } 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Prov.
             */
            public Builder prov(String prov) {
                this.prov = prov;
                return this;
            }

            public NodesGeoData build() {
                return new NodesGeoData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("CloudNetId")
        private String cloudNetId;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("GeoData")
        private NodesGeoData geoData;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameEn")
        private String nameEn;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Nodes(Builder builder) {
            this.address = builder.address;
            this.cloudNetId = builder.cloudNetId;
            this.error = builder.error;
            this.geoData = builder.geoData;
            this.id = builder.id;
            this.name = builder.name;
            this.nameEn = builder.nameEn;
            this.nodeType = builder.nodeType;
            this.resourceId = builder.resourceId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cloudNetId
         */
        public String getCloudNetId() {
            return this.cloudNetId;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return geoData
         */
        public NodesGeoData getGeoData() {
            return this.geoData;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String address; 
            private String cloudNetId; 
            private String error; 
            private NodesGeoData geoData; 
            private Long id; 
            private String name; 
            private String nameEn; 
            private String nodeType; 
            private String resourceId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.address = model.address;
                this.cloudNetId = model.cloudNetId;
                this.error = model.error;
                this.geoData = model.geoData;
                this.id = model.id;
                this.name = model.name;
                this.nameEn = model.nameEn;
                this.nodeType = model.nodeType;
                this.resourceId = model.resourceId;
                this.success = model.success;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * CloudNetId.
             */
            public Builder cloudNetId(String cloudNetId) {
                this.cloudNetId = cloudNetId;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * GeoData.
             */
            public Builder geoData(NodesGeoData geoData) {
                this.geoData = geoData;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * NameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class NetworkLinkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dns")
        private Dns dns;

        @com.aliyun.core.annotation.NameInMap("FBT")
        private String FBT;

        @com.aliyun.core.annotation.NameInMap("Links")
        private java.util.List<Links> links;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private NetworkLinkInfo(Builder builder) {
            this.dns = builder.dns;
            this.FBT = builder.FBT;
            this.links = builder.links;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkLinkInfo create() {
            return builder().build();
        }

        /**
         * @return dns
         */
        public Dns getDns() {
            return this.dns;
        }

        /**
         * @return FBT
         */
        public String getFBT() {
            return this.FBT;
        }

        /**
         * @return links
         */
        public java.util.List<Links> getLinks() {
            return this.links;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private Dns dns; 
            private String FBT; 
            private java.util.List<Links> links; 
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(NetworkLinkInfo model) {
                this.dns = model.dns;
                this.FBT = model.FBT;
                this.links = model.links;
                this.nodes = model.nodes;
            } 

            /**
             * Dns.
             */
            public Builder dns(Dns dns) {
                this.dns = dns;
                return this;
            }

            /**
             * FBT.
             */
            public Builder FBT(String FBT) {
                this.FBT = FBT;
                return this;
            }

            /**
             * Links.
             */
            public Builder links(java.util.List<Links> links) {
                this.links = links;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public NetworkLinkInfo build() {
                return new NetworkLinkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class DeviceAttributeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("File")
        private java.util.List<String> file;

        @com.aliyun.core.annotation.NameInMap("Firewall")
        private String firewall;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("InnerIp")
        private String innerIp;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("MatchedSecurityBaseline")
        private String matchedSecurityBaseline;

        @com.aliyun.core.annotation.NameInMap("Process")
        private java.util.List<String> process;

        @com.aliyun.core.annotation.NameInMap("Ssid")
        private String ssid;

        private DeviceAttributeInfo(Builder builder) {
            this.devTag = builder.devTag;
            this.deviceType = builder.deviceType;
            this.file = builder.file;
            this.firewall = builder.firewall;
            this.hostname = builder.hostname;
            this.innerIp = builder.innerIp;
            this.internetIp = builder.internetIp;
            this.mac = builder.mac;
            this.matchedSecurityBaseline = builder.matchedSecurityBaseline;
            this.process = builder.process;
            this.ssid = builder.ssid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceAttributeInfo create() {
            return builder().build();
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return file
         */
        public java.util.List<String> getFile() {
            return this.file;
        }

        /**
         * @return firewall
         */
        public String getFirewall() {
            return this.firewall;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return innerIp
         */
        public String getInnerIp() {
            return this.innerIp;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return matchedSecurityBaseline
         */
        public String getMatchedSecurityBaseline() {
            return this.matchedSecurityBaseline;
        }

        /**
         * @return process
         */
        public java.util.List<String> getProcess() {
            return this.process;
        }

        /**
         * @return ssid
         */
        public String getSsid() {
            return this.ssid;
        }

        public static final class Builder {
            private String devTag; 
            private String deviceType; 
            private java.util.List<String> file; 
            private String firewall; 
            private String hostname; 
            private String innerIp; 
            private String internetIp; 
            private String mac; 
            private String matchedSecurityBaseline; 
            private java.util.List<String> process; 
            private String ssid; 

            private Builder() {
            } 

            private Builder(DeviceAttributeInfo model) {
                this.devTag = model.devTag;
                this.deviceType = model.deviceType;
                this.file = model.file;
                this.firewall = model.firewall;
                this.hostname = model.hostname;
                this.innerIp = model.innerIp;
                this.internetIp = model.internetIp;
                this.mac = model.mac;
                this.matchedSecurityBaseline = model.matchedSecurityBaseline;
                this.process = model.process;
                this.ssid = model.ssid;
            } 

            /**
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * File.
             */
            public Builder file(java.util.List<String> file) {
                this.file = file;
                return this;
            }

            /**
             * Firewall.
             */
            public Builder firewall(String firewall) {
                this.firewall = firewall;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * InnerIp.
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * MatchedSecurityBaseline.
             */
            public Builder matchedSecurityBaseline(String matchedSecurityBaseline) {
                this.matchedSecurityBaseline = matchedSecurityBaseline;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(java.util.List<String> process) {
                this.process = process;
                return this;
            }

            /**
             * <p>SSID。</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder ssid(String ssid) {
                this.ssid = ssid;
                return this;
            }

            public DeviceAttributeInfo build() {
                return new DeviceAttributeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class RouteStrategyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        private RouteStrategyInfo(Builder builder) {
            this.routeType = builder.routeType;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteStrategyInfo create() {
            return builder().build();
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        public static final class Builder {
            private String routeType; 
            private String strategyId; 
            private String strategyName; 

            private Builder() {
            } 

            private Builder(RouteStrategyInfo model) {
                this.routeType = model.routeType;
                this.strategyId = model.strategyId;
                this.strategyName = model.strategyName;
            } 

            /**
             * RouteType.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            public RouteStrategyInfo build() {
                return new RouteStrategyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class UserGroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Group")
        private java.util.List<String> group;

        @com.aliyun.core.annotation.NameInMap("MatchedUserGroups")
        private String matchedUserGroups;

        @com.aliyun.core.annotation.NameInMap("Telephone")
        private String telephone;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private UserGroupInfo(Builder builder) {
            this.email = builder.email;
            this.group = builder.group;
            this.matchedUserGroups = builder.matchedUserGroups;
            this.telephone = builder.telephone;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroupInfo create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return group
         */
        public java.util.List<String> getGroup() {
            return this.group;
        }

        /**
         * @return matchedUserGroups
         */
        public String getMatchedUserGroups() {
            return this.matchedUserGroups;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String email; 
            private java.util.List<String> group; 
            private String matchedUserGroups; 
            private String telephone; 
            private String username; 

            private Builder() {
            } 

            private Builder(UserGroupInfo model) {
                this.email = model.email;
                this.group = model.group;
                this.matchedUserGroups = model.matchedUserGroups;
                this.telephone = model.telephone;
                this.username = model.username;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(java.util.List<String> group) {
                this.group = group;
                return this;
            }

            /**
             * MatchedUserGroups.
             */
            public Builder matchedUserGroups(String matchedUserGroups) {
                this.matchedUserGroups = matchedUserGroups;
                return this;
            }

            /**
             * Telephone.
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public UserGroupInfo build() {
                return new UserGroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class ZeroTrustPolicyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BlockInfo")
        private String blockInfo;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private ZeroTrustPolicyInfo(Builder builder) {
            this.action = builder.action;
            this.appName = builder.appName;
            this.blockInfo = builder.blockInfo;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZeroTrustPolicyInfo create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return blockInfo
         */
        public String getBlockInfo() {
            return this.blockInfo;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String action; 
            private String appName; 
            private String blockInfo; 
            private String policyName; 

            private Builder() {
            } 

            private Builder(ZeroTrustPolicyInfo model) {
                this.action = model.action;
                this.appName = model.appName;
                this.blockInfo = model.blockInfo;
                this.policyName = model.policyName;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BlockInfo.
             */
            public Builder blockInfo(String blockInfo) {
                this.blockInfo = blockInfo;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public ZeroTrustPolicyInfo build() {
                return new ZeroTrustPolicyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class PolicyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceAttributeInfo")
        private DeviceAttributeInfo deviceAttributeInfo;

        @com.aliyun.core.annotation.NameInMap("ProcessTime")
        private Long processTime;

        @com.aliyun.core.annotation.NameInMap("RouteStrategyInfo")
        private RouteStrategyInfo routeStrategyInfo;

        @com.aliyun.core.annotation.NameInMap("UserGroupInfo")
        private UserGroupInfo userGroupInfo;

        @com.aliyun.core.annotation.NameInMap("ZeroTrustPolicyInfo")
        private ZeroTrustPolicyInfo zeroTrustPolicyInfo;

        private PolicyInfo(Builder builder) {
            this.deviceAttributeInfo = builder.deviceAttributeInfo;
            this.processTime = builder.processTime;
            this.routeStrategyInfo = builder.routeStrategyInfo;
            this.userGroupInfo = builder.userGroupInfo;
            this.zeroTrustPolicyInfo = builder.zeroTrustPolicyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyInfo create() {
            return builder().build();
        }

        /**
         * @return deviceAttributeInfo
         */
        public DeviceAttributeInfo getDeviceAttributeInfo() {
            return this.deviceAttributeInfo;
        }

        /**
         * @return processTime
         */
        public Long getProcessTime() {
            return this.processTime;
        }

        /**
         * @return routeStrategyInfo
         */
        public RouteStrategyInfo getRouteStrategyInfo() {
            return this.routeStrategyInfo;
        }

        /**
         * @return userGroupInfo
         */
        public UserGroupInfo getUserGroupInfo() {
            return this.userGroupInfo;
        }

        /**
         * @return zeroTrustPolicyInfo
         */
        public ZeroTrustPolicyInfo getZeroTrustPolicyInfo() {
            return this.zeroTrustPolicyInfo;
        }

        public static final class Builder {
            private DeviceAttributeInfo deviceAttributeInfo; 
            private Long processTime; 
            private RouteStrategyInfo routeStrategyInfo; 
            private UserGroupInfo userGroupInfo; 
            private ZeroTrustPolicyInfo zeroTrustPolicyInfo; 

            private Builder() {
            } 

            private Builder(PolicyInfo model) {
                this.deviceAttributeInfo = model.deviceAttributeInfo;
                this.processTime = model.processTime;
                this.routeStrategyInfo = model.routeStrategyInfo;
                this.userGroupInfo = model.userGroupInfo;
                this.zeroTrustPolicyInfo = model.zeroTrustPolicyInfo;
            } 

            /**
             * DeviceAttributeInfo.
             */
            public Builder deviceAttributeInfo(DeviceAttributeInfo deviceAttributeInfo) {
                this.deviceAttributeInfo = deviceAttributeInfo;
                return this;
            }

            /**
             * ProcessTime.
             */
            public Builder processTime(Long processTime) {
                this.processTime = processTime;
                return this;
            }

            /**
             * RouteStrategyInfo.
             */
            public Builder routeStrategyInfo(RouteStrategyInfo routeStrategyInfo) {
                this.routeStrategyInfo = routeStrategyInfo;
                return this;
            }

            /**
             * UserGroupInfo.
             */
            public Builder userGroupInfo(UserGroupInfo userGroupInfo) {
                this.userGroupInfo = userGroupInfo;
                return this;
            }

            /**
             * ZeroTrustPolicyInfo.
             */
            public Builder zeroTrustPolicyInfo(ZeroTrustPolicyInfo zeroTrustPolicyInfo) {
                this.zeroTrustPolicyInfo = zeroTrustPolicyInfo;
                return this;
            }

            public PolicyInfo build() {
                return new PolicyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("NetworkLinkInfo")
        private NetworkLinkInfo networkLinkInfo;

        @com.aliyun.core.annotation.NameInMap("PolicyInfo")
        private PolicyInfo policyInfo;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Result(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.flowId = builder.flowId;
            this.networkLinkInfo = builder.networkLinkInfo;
            this.policyInfo = builder.policyInfo;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return networkLinkInfo
         */
        public NetworkLinkInfo getNetworkLinkInfo() {
            return this.networkLinkInfo;
        }

        /**
         * @return policyInfo
         */
        public PolicyInfo getPolicyInfo() {
            return this.policyInfo;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorMessage; 
            private String flowId; 
            private NetworkLinkInfo networkLinkInfo; 
            private PolicyInfo policyInfo; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.errorMessage = model.errorMessage;
                this.flowId = model.flowId;
                this.networkLinkInfo = model.networkLinkInfo;
                this.policyInfo = model.policyInfo;
                this.success = model.success;
            } 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * NetworkLinkInfo.
             */
            public Builder networkLinkInfo(NetworkLinkInfo networkLinkInfo) {
                this.networkLinkInfo = networkLinkInfo;
                return this;
            }

            /**
             * PolicyInfo.
             */
            public Builder policyInfo(PolicyInfo policyInfo) {
                this.policyInfo = policyInfo;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class UdpExtraConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpectedResponse")
        private String expectedResponse;

        @com.aliyun.core.annotation.NameInMap("RequestContent")
        private String requestContent;

        private UdpExtraConfigs(Builder builder) {
            this.expectedResponse = builder.expectedResponse;
            this.requestContent = builder.requestContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdpExtraConfigs create() {
            return builder().build();
        }

        /**
         * @return expectedResponse
         */
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        /**
         * @return requestContent
         */
        public String getRequestContent() {
            return this.requestContent;
        }

        public static final class Builder {
            private String expectedResponse; 
            private String requestContent; 

            private Builder() {
            } 

            private Builder(UdpExtraConfigs model) {
                this.expectedResponse = model.expectedResponse;
                this.requestContent = model.requestContent;
            } 

            /**
             * ExpectedResponse.
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * RequestContent.
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            public UdpExtraConfigs build() {
                return new UdpExtraConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class UserGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        private UserGroup(Builder builder) {
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroup create() {
            return builder().build();
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String userGroupId; 
            private String userGroupName; 

            private Builder() {
            } 

            private Builder(UserGroup model) {
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
            } 

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserGroupName.
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public UserGroup build() {
                return new UserGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPADiagnosisTaskResponseBody</p>
     */
    public static class DiagnosisTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DiagnoseId")
        private String diagnoseId;

        @com.aliyun.core.annotation.NameInMap("DiagnoseType")
        private String diagnoseType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("PopId")
        private String popId;

        @com.aliyun.core.annotation.NameInMap("PopMode")
        private String popMode;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UdpExtraConfigs")
        private UdpExtraConfigs udpExtraConfigs;

        @com.aliyun.core.annotation.NameInMap("UserGroup")
        private UserGroup userGroup;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private DiagnosisTask(Builder builder) {
            this.createTime = builder.createTime;
            this.devTag = builder.devTag;
            this.diagnoseId = builder.diagnoseId;
            this.diagnoseType = builder.diagnoseType;
            this.host = builder.host;
            this.popId = builder.popId;
            this.popMode = builder.popMode;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.result = builder.result;
            this.status = builder.status;
            this.udpExtraConfigs = builder.udpExtraConfigs;
            this.userGroup = builder.userGroup;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosisTask create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return diagnoseId
         */
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        /**
         * @return diagnoseType
         */
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return popId
         */
        public String getPopId() {
            return this.popId;
        }

        /**
         * @return popMode
         */
        public String getPopMode() {
            return this.popMode;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return udpExtraConfigs
         */
        public UdpExtraConfigs getUdpExtraConfigs() {
            return this.udpExtraConfigs;
        }

        /**
         * @return userGroup
         */
        public UserGroup getUserGroup() {
            return this.userGroup;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String createTime; 
            private String devTag; 
            private String diagnoseId; 
            private String diagnoseType; 
            private String host; 
            private String popId; 
            private String popMode; 
            private String port; 
            private String protocol; 
            private Result result; 
            private String status; 
            private UdpExtraConfigs udpExtraConfigs; 
            private UserGroup userGroup; 
            private String username; 

            private Builder() {
            } 

            private Builder(DiagnosisTask model) {
                this.createTime = model.createTime;
                this.devTag = model.devTag;
                this.diagnoseId = model.diagnoseId;
                this.diagnoseType = model.diagnoseType;
                this.host = model.host;
                this.popId = model.popId;
                this.popMode = model.popMode;
                this.port = model.port;
                this.protocol = model.protocol;
                this.result = model.result;
                this.status = model.status;
                this.udpExtraConfigs = model.udpExtraConfigs;
                this.userGroup = model.userGroup;
                this.username = model.username;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * DiagnoseId.
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * DiagnoseType.
             */
            public Builder diagnoseType(String diagnoseType) {
                this.diagnoseType = diagnoseType;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * PopId.
             */
            public Builder popId(String popId) {
                this.popId = popId;
                return this;
            }

            /**
             * PopMode.
             */
            public Builder popMode(String popMode) {
                this.popMode = popMode;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
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
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UdpExtraConfigs.
             */
            public Builder udpExtraConfigs(UdpExtraConfigs udpExtraConfigs) {
                this.udpExtraConfigs = udpExtraConfigs;
                return this;
            }

            /**
             * UserGroup.
             */
            public Builder userGroup(UserGroup userGroup) {
                this.userGroup = userGroup;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public DiagnosisTask build() {
                return new DiagnosisTask(this);
            } 

        } 

    }
}
