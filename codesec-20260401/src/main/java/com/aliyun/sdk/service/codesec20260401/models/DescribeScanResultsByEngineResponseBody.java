// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanResultsByEngineResponseBody</p>
 */
public class DescribeScanResultsByEngineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scanId")
    private Long scanId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private DescribeScanResultsByEngineResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.scanId = builder.scanId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanResultsByEngineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanId
     */
    public Long getScanId() {
        return this.scanId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String engine; 
        private java.util.List<Items> items; 
        private Long maxResults; 
        private String nextToken; 
        private Long projectId; 
        private String requestId; 
        private Long scanId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScanResultsByEngineResponseBody model) {
            this.engine = model.engine;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.scanId = model.scanId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li>sast</li>
         * <li>sca</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The result list.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Do not specify this parameter for the first page or set it to an empty string. For subsequent pages, pass the nextToken value from the previous response without any modification. If the nextToken value in the response is empty, the last page has been reached.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76851f2b5bf0187fbc29e8bca4</p>
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3088795</p>
         */
        public Builder scanId(Long scanId) {
            this.scanId = scanId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScanResultsByEngineResponseBody build() {
            return new DescribeScanResultsByEngineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class CveDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("cvss")
        private Double cvss;

        @com.aliyun.core.annotation.NameInMap("cvssVersion")
        private String cvssVersion;

        @com.aliyun.core.annotation.NameInMap("cweId")
        private String cweId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fixedVersion")
        private String fixedVersion;

        @com.aliyun.core.annotation.NameInMap("references")
        private java.util.List<String> references;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        private CveDetails(Builder builder) {
            this.cveId = builder.cveId;
            this.cvss = builder.cvss;
            this.cvssVersion = builder.cvssVersion;
            this.cweId = builder.cweId;
            this.description = builder.description;
            this.fixedVersion = builder.fixedVersion;
            this.references = builder.references;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CveDetails create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cvss
         */
        public Double getCvss() {
            return this.cvss;
        }

        /**
         * @return cvssVersion
         */
        public String getCvssVersion() {
            return this.cvssVersion;
        }

        /**
         * @return cweId
         */
        public String getCweId() {
            return this.cweId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fixedVersion
         */
        public String getFixedVersion() {
            return this.fixedVersion;
        }

        /**
         * @return references
         */
        public java.util.List<String> getReferences() {
            return this.references;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String cveId; 
            private Double cvss; 
            private String cvssVersion; 
            private String cweId; 
            private String description; 
            private String fixedVersion; 
            private java.util.List<String> references; 
            private String severity; 

            private Builder() {
            } 

            private Builder(CveDetails model) {
                this.cveId = model.cveId;
                this.cvss = model.cvss;
                this.cvssVersion = model.cvssVersion;
                this.cweId = model.cweId;
                this.description = model.description;
                this.fixedVersion = model.fixedVersion;
                this.references = model.references;
                this.severity = model.severity;
            } 

            /**
             * <p>The associated CWE ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2021-44228</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The CVSS score.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cvss(Double cvss) {
                this.cvss = cvss;
                return this;
            }

            /**
             * <p>The CVSS version.</p>
             * 
             * <strong>example:</strong>
             * <p>v2.0</p>
             */
            public Builder cvssVersion(String cvssVersion) {
                this.cvssVersion = cvssVersion;
                return this;
            }

            /**
             * <p>The associated CWE ID. This value can be absent or an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>CWE-79</p>
             */
            public Builder cweId(String cweId) {
                this.cweId = cweId;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Apache Log4j2 JNDI features do not protect against attacker-controlled LDAP and other JNDI-related endpoints.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The target version for the fix. This value can be absent or an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fixedVersion(String fixedVersion) {
                this.fixedVersion = fixedVersion;
                return this;
            }

            /**
             * <p>The reference information.</p>
             */
            public Builder references(java.util.List<String> references) {
                this.references = references;
                return this;
            }

            /**
             * <p>The severity level. Valid values:</p>
             * <ul>
             * <li>critical</li>
             * <li>high</li>
             * <li>medium</li>
             * <li>low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>critical</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public CveDetails build() {
                return new CveDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class Detected extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isFsfLibre")
        private Boolean isFsfLibre;

        @com.aliyun.core.annotation.NameInMap("isOsiApproved")
        private Boolean isOsiApproved;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("spdxId")
        private String spdxId;

        private Detected(Builder builder) {
            this.isFsfLibre = builder.isFsfLibre;
            this.isOsiApproved = builder.isOsiApproved;
            this.name = builder.name;
            this.spdxId = builder.spdxId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detected create() {
            return builder().build();
        }

        /**
         * @return isFsfLibre
         */
        public Boolean getIsFsfLibre() {
            return this.isFsfLibre;
        }

        /**
         * @return isOsiApproved
         */
        public Boolean getIsOsiApproved() {
            return this.isOsiApproved;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spdxId
         */
        public String getSpdxId() {
            return this.spdxId;
        }

        public static final class Builder {
            private Boolean isFsfLibre; 
            private Boolean isOsiApproved; 
            private String name; 
            private String spdxId; 

            private Builder() {
            } 

            private Builder(Detected model) {
                this.isFsfLibre = model.isFsfLibre;
                this.isOsiApproved = model.isOsiApproved;
                this.name = model.name;
                this.spdxId = model.spdxId;
            } 

            /**
             * <p>Indicates whether the license is listed as a free license by the FSF. If this key is absent, it means the license is not annotated, which differs from an explicit false value.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFsfLibre(Boolean isFsfLibre) {
                this.isFsfLibre = isFsfLibre;
                return this;
            }

            /**
             * <p>Indicates whether the license is OSI-approved.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOsiApproved(Boolean isOsiApproved) {
                this.isOsiApproved = isOsiApproved;
                return this;
            }

            /**
             * <p>The full name of the license.</p>
             * 
             * <strong>example:</strong>
             * <p>ISC License</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The SPDX license identifier. If the license cannot be determined, the value is NOASSERTION. The value may be in a non-standard format, such as Apache 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>AFL-2.1</p>
             */
            public Builder spdxId(String spdxId) {
                this.spdxId = spdxId;
                return this;
            }

            public Detected build() {
                return new Detected(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class License extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("concluded")
        private String concluded;

        @com.aliyun.core.annotation.NameInMap("detected")
        private java.util.List<Detected> detected;

        private License(Builder builder) {
            this.concluded = builder.concluded;
            this.detected = builder.detected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static License create() {
            return builder().build();
        }

        /**
         * @return concluded
         */
        public String getConcluded() {
            return this.concluded;
        }

        /**
         * @return detected
         */
        public java.util.List<Detected> getDetected() {
            return this.detected;
        }

        public static final class Builder {
            private String concluded; 
            private java.util.List<Detected> detected; 

            private Builder() {
            } 

            private Builder(License model) {
                this.concluded = model.concluded;
                this.detected = model.detected;
            } 

            /**
             * <p>The concluded license expression (SPDX expression, which may contain OR or AND). This is an identifier string only, without full names or OSI/FSF annotations.</p>
             * 
             * <strong>example:</strong>
             * <p>AFL-2.1 OR BSD-3-Clause</p>
             */
            public Builder concluded(String concluded) {
                this.concluded = concluded;
                return this;
            }

            /**
             * <p>The list of detected licenses.</p>
             */
            public Builder detected(java.util.List<Detected> detected) {
                this.detected = detected;
                return this;
            }

            public License build() {
                return new License(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class ScaComponent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("cveCount")
        private Long cveCount;

        @com.aliyun.core.annotation.NameInMap("cveDetails")
        private java.util.List<CveDetails> cveDetails;

        @com.aliyun.core.annotation.NameInMap("declaredIn")
        private String declaredIn;

        @com.aliyun.core.annotation.NameInMap("ecosystem")
        private String ecosystem;

        @com.aliyun.core.annotation.NameInMap("introPaths")
        private java.util.List<String> introPaths;

        @com.aliyun.core.annotation.NameInMap("isDirect")
        private Boolean isDirect;

        @com.aliyun.core.annotation.NameInMap("license")
        private License license;

        @com.aliyun.core.annotation.NameInMap("packageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("purl")
        private String purl;

        @com.aliyun.core.annotation.NameInMap("remediation")
        private String remediation;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ScaComponent(Builder builder) {
            this.componentType = builder.componentType;
            this.cveCount = builder.cveCount;
            this.cveDetails = builder.cveDetails;
            this.declaredIn = builder.declaredIn;
            this.ecosystem = builder.ecosystem;
            this.introPaths = builder.introPaths;
            this.isDirect = builder.isDirect;
            this.license = builder.license;
            this.packageName = builder.packageName;
            this.purl = builder.purl;
            this.remediation = builder.remediation;
            this.scope = builder.scope;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaComponent create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return cveCount
         */
        public Long getCveCount() {
            return this.cveCount;
        }

        /**
         * @return cveDetails
         */
        public java.util.List<CveDetails> getCveDetails() {
            return this.cveDetails;
        }

        /**
         * @return declaredIn
         */
        public String getDeclaredIn() {
            return this.declaredIn;
        }

        /**
         * @return ecosystem
         */
        public String getEcosystem() {
            return this.ecosystem;
        }

        /**
         * @return introPaths
         */
        public java.util.List<String> getIntroPaths() {
            return this.introPaths;
        }

        /**
         * @return isDirect
         */
        public Boolean getIsDirect() {
            return this.isDirect;
        }

        /**
         * @return license
         */
        public License getLicense() {
            return this.license;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return purl
         */
        public String getPurl() {
            return this.purl;
        }

        /**
         * @return remediation
         */
        public String getRemediation() {
            return this.remediation;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String componentType; 
            private Long cveCount; 
            private java.util.List<CveDetails> cveDetails; 
            private String declaredIn; 
            private String ecosystem; 
            private java.util.List<String> introPaths; 
            private Boolean isDirect; 
            private License license; 
            private String packageName; 
            private String purl; 
            private String remediation; 
            private String scope; 
            private String version; 

            private Builder() {
            } 

            private Builder(ScaComponent model) {
                this.componentType = model.componentType;
                this.cveCount = model.cveCount;
                this.cveDetails = model.cveDetails;
                this.declaredIn = model.declaredIn;
                this.ecosystem = model.ecosystem;
                this.introPaths = model.introPaths;
                this.isDirect = model.isDirect;
                this.license = model.license;
                this.packageName = model.packageName;
                this.purl = model.purl;
                this.remediation = model.remediation;
                this.scope = model.scope;
                this.version = model.version;
            } 

            /**
             * <p>The component type, such as library, application, or framework.</p>
             * 
             * <strong>example:</strong>
             * <p>library</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The number of CVEs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cveCount(Long cveCount) {
                this.cveCount = cveCount;
                return this;
            }

            /**
             * <p>The list of CVE details associated with a component in the SCA finding.</p>
             */
            public Builder cveDetails(java.util.List<CveDetails> cveDetails) {
                this.cveDetails = cveDetails;
                return this;
            }

            /**
             * <p>The manifest file in which the dependency is declared.</p>
             * 
             * <strong>example:</strong>
             * <p>node_modules/semver</p>
             */
            public Builder declaredIn(String declaredIn) {
                this.declaredIn = declaredIn;
                return this;
            }

            /**
             * <p>The component ecosystem, such as npm, maven, pypi, or go.</p>
             * 
             * <strong>example:</strong>
             * <p>maven</p>
             */
            public Builder ecosystem(String ecosystem) {
                this.ecosystem = ecosystem;
                return this;
            }

            /**
             * <p>The list of dependency introduction paths in the SCA component information. This is returned only when engine is set to sca.</p>
             */
            public Builder introPaths(java.util.List<String> introPaths) {
                this.introPaths = introPaths;
                return this;
            }

            /**
             * <p>Indicates whether the dependency is a direct dependency.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDirect(Boolean isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * <p>The license determination result.</p>
             */
            public Builder license(License license) {
                this.license = license;
                return this;
            }

            /**
             * <p>The component coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.logging.log4j:log4j-core</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The Package URL, which serves as the unique coordinate of the component within the scan.</p>
             * 
             * <strong>example:</strong>
             * <p>pkg:npm/<a href="mailto:glob-parent@3.1.0">glob-parent@3.1.0</a></p>
             */
            public Builder purl(String purl) {
                this.purl = purl;
                return this;
            }

            /**
             * <p>The component-level remediation suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>Upgrade log4j-core to version 2.17.1 or later</p>
             */
            public Builder remediation(String remediation) {
                this.remediation = remediation;
                return this;
            }

            /**
             * <p>The dependency scope, such as runtime, required, optional, or dev.</p>
             * 
             * <strong>example:</strong>
             * <p>runtime</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The component version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.14.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ScaComponent build() {
                return new ScaComponent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class TaintFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("file")
        private String file;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("line")
        private Integer line;

        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("step")
        private Integer step;

        private TaintFlow(Builder builder) {
            this.code = builder.code;
            this.file = builder.file;
            this.kind = builder.kind;
            this.line = builder.line;
            this.note = builder.note;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaintFlow create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return line
         */
        public Integer getLine() {
            return this.line;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private String code; 
            private String file; 
            private String kind; 
            private Integer line; 
            private String note; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(TaintFlow model) {
                this.code = model.code;
                this.file = model.file;
                this.kind = model.kind;
                this.line = model.line;
                this.note = model.note;
                this.step = model.step;
            } 

            /**
             * <p>The code.</p>
             * 
             * <strong>example:</strong>
             * <p>stmt.executeQuery(sql);</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>src/main/java/com/example/UserService.java</p>
             */
            public Builder file(String file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The role type in the taint propagation chain. Valid values:</p>
             * <ul>
             * <li>source: taint source</li>
             * <li>propagator: propagation node	</li>
             * <li>validation: validation or scrubbing center	</li>
             * <li>sink: dangerous sink</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The line number.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder line(Integer line) {
                this.line = line;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Sink: SQL query executed</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The step sequence number, starting from 0 and incrementing.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public TaintFlow build() {
                return new TaintFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baselineState")
        private String baselineState;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("codeSnippet")
        private String codeSnippet;

        @com.aliyun.core.annotation.NameInMap("confidence")
        private Double confidence;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("cweId")
        private String cweId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endLine")
        private Long endLine;

        @com.aliyun.core.annotation.NameInMap("filePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("itemSummary")
        private String itemSummary;

        @com.aliyun.core.annotation.NameInMap("owaspCategory")
        private String owaspCategory;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("remediationCodeExample")
        private String remediationCodeExample;

        @com.aliyun.core.annotation.NameInMap("remediationSuggestion")
        private String remediationSuggestion;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("scaComponent")
        private ScaComponent scaComponent;

        @com.aliyun.core.annotation.NameInMap("scanId")
        private Long scanId;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("startLine")
        private Long startLine;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taintFlow")
        private java.util.List<TaintFlow> taintFlow;

        @com.aliyun.core.annotation.NameInMap("taintFlowSummary")
        private String taintFlowSummary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Items(Builder builder) {
            this.baselineState = builder.baselineState;
            this.category = builder.category;
            this.codeSnippet = builder.codeSnippet;
            this.confidence = builder.confidence;
            this.createdAt = builder.createdAt;
            this.cweId = builder.cweId;
            this.description = builder.description;
            this.endLine = builder.endLine;
            this.filePath = builder.filePath;
            this.id = builder.id;
            this.itemSummary = builder.itemSummary;
            this.owaspCategory = builder.owaspCategory;
            this.projectName = builder.projectName;
            this.remediationCodeExample = builder.remediationCodeExample;
            this.remediationSuggestion = builder.remediationSuggestion;
            this.ruleId = builder.ruleId;
            this.scaComponent = builder.scaComponent;
            this.scanId = builder.scanId;
            this.severity = builder.severity;
            this.source = builder.source;
            this.startLine = builder.startLine;
            this.status = builder.status;
            this.taintFlow = builder.taintFlow;
            this.taintFlowSummary = builder.taintFlowSummary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return baselineState
         */
        public String getBaselineState() {
            return this.baselineState;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return codeSnippet
         */
        public String getCodeSnippet() {
            return this.codeSnippet;
        }

        /**
         * @return confidence
         */
        public Double getConfidence() {
            return this.confidence;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return cweId
         */
        public String getCweId() {
            return this.cweId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endLine
         */
        public Long getEndLine() {
            return this.endLine;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return itemSummary
         */
        public String getItemSummary() {
            return this.itemSummary;
        }

        /**
         * @return owaspCategory
         */
        public String getOwaspCategory() {
            return this.owaspCategory;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return remediationCodeExample
         */
        public String getRemediationCodeExample() {
            return this.remediationCodeExample;
        }

        /**
         * @return remediationSuggestion
         */
        public String getRemediationSuggestion() {
            return this.remediationSuggestion;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return scaComponent
         */
        public ScaComponent getScaComponent() {
            return this.scaComponent;
        }

        /**
         * @return scanId
         */
        public Long getScanId() {
            return this.scanId;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return startLine
         */
        public Long getStartLine() {
            return this.startLine;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taintFlow
         */
        public java.util.List<TaintFlow> getTaintFlow() {
            return this.taintFlow;
        }

        /**
         * @return taintFlowSummary
         */
        public String getTaintFlowSummary() {
            return this.taintFlowSummary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String baselineState; 
            private String category; 
            private String codeSnippet; 
            private Double confidence; 
            private String createdAt; 
            private String cweId; 
            private String description; 
            private Long endLine; 
            private String filePath; 
            private Long id; 
            private String itemSummary; 
            private String owaspCategory; 
            private String projectName; 
            private String remediationCodeExample; 
            private String remediationSuggestion; 
            private String ruleId; 
            private ScaComponent scaComponent; 
            private Long scanId; 
            private String severity; 
            private String source; 
            private Long startLine; 
            private String status; 
            private java.util.List<TaintFlow> taintFlow; 
            private String taintFlowSummary; 
            private String title; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.baselineState = model.baselineState;
                this.category = model.category;
                this.codeSnippet = model.codeSnippet;
                this.confidence = model.confidence;
                this.createdAt = model.createdAt;
                this.cweId = model.cweId;
                this.description = model.description;
                this.endLine = model.endLine;
                this.filePath = model.filePath;
                this.id = model.id;
                this.itemSummary = model.itemSummary;
                this.owaspCategory = model.owaspCategory;
                this.projectName = model.projectName;
                this.remediationCodeExample = model.remediationCodeExample;
                this.remediationSuggestion = model.remediationSuggestion;
                this.ruleId = model.ruleId;
                this.scaComponent = model.scaComponent;
                this.scanId = model.scanId;
                this.severity = model.severity;
                this.source = model.source;
                this.startLine = model.startLine;
                this.status = model.status;
                this.taintFlow = model.taintFlow;
                this.taintFlowSummary = model.taintFlowSummary;
                this.title = model.title;
            } 

            /**
             * <p>Filters results by the baseline state of incremental scans. Valid values: new, unchanged, absent, and updated.</p>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder baselineState(String baselineState) {
                this.baselineState = baselineState;
                return this;
            }

            /**
             * <p>The category. PDS classifies files based on their file name extensions and MIME types. Main categories include doc, image, audio, and video.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL Injection</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The code snippet near the primary location (SAST).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder codeSnippet(String codeSnippet) {
                this.codeSnippet = codeSnippet;
                return this;
            }

            /**
             * <p>The rule confidence level, ranging from 0 to 1. This is common in SAST results and is omitted if not available.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder confidence(Double confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The time when the finding record was created, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-28T03:36:31.573Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The associated CWE ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CWE-601</p>
             */
            public Builder cweId(String cweId) {
                this.cweId = cweId;
                return this;
            }

            /**
             * <p>The issue description.</p>
             * 
             * <strong>example:</strong>
             * <p>User input is directly concatenated into an SQL statement, which may lead to SQL injection.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end line number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endLine(Long endLine) {
                this.endLine = endLine;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>aone2/2247063/1767838276141/Artifacts_EBookingApps_Pipeline_V2_Staging_131.tgz</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>934</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The brief summary of the finding. Unlike description, this is more of a conclusion statement.</p>
             * 
             * <strong>example:</strong>
             * <p>User input is used to construct SQL queries without sanitization</p>
             */
            public Builder itemSummary(String itemSummary) {
                this.itemSummary = itemSummary;
                return this;
            }

            /**
             * <p>The OWASP category.</p>
             * 
             * <strong>example:</strong>
             * <p>A01:2021-Broken Access Control</p>
             */
            public Builder owaspCategory(String owaspCategory) {
                this.owaspCategory = owaspCategory;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>cdp2cdl_cdp_sha_nprd</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The remediation code example.</p>
             * 
             * <strong>example:</strong>
             * <p>String sql = \&quot;SELECT * FROM users WHERE name = ?\&quot;;\nPreparedStatement ps = conn.prepareStatement(sql);\nps.setString(1, username);\nResultSet rs = ps.executeQuery();</p>
             */
            public Builder remediationCodeExample(String remediationCodeExample) {
                this.remediationCodeExample = remediationCodeExample;
                return this;
            }

            /**
             * <p>The remediation suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>Use PreparedStatement with parameterized queries instead of string concatenation</p>
             */
            public Builder remediationSuggestion(String remediationSuggestion) {
                this.remediationSuggestion = remediationSuggestion;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>java-sqli-001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The SCA component information. This is returned only when engine is set to sca.</p>
             */
            public Builder scaComponent(ScaComponent scaComponent) {
                this.scaComponent = scaComponent;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3176</p>
             */
            public Builder scanId(Long scanId) {
                this.scanId = scanId;
                return this;
            }

            /**
             * <p>The severity level. Valid values:</p>
             * <ul>
             * <li>critical </li>
             * <li>high </li>
             * <li>medium </li>
             * <li>low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>todo_open_dingoj06pvqfeayy3lkr</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The start line number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder startLine(Long startLine) {
                this.startLine = startLine;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>running: Running.</li>
             * <li>completed: Completed.</li>
             * <li>failed: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The SAST taint analysis call chain, which describes the complete propagation path of sensitive data from the taint source to the dangerous sink. This is returned only when engine is set to sast.</p>
             */
            public Builder taintFlow(java.util.List<TaintFlow> taintFlow) {
                this.taintFlow = taintFlow;
                return this;
            }

            /**
             * <p>The text summary of the taint call chain. This is returned only when engine is set to sast.</p>
             * 
             * <strong>example:</strong>
             * <p>User input flows from HTTP parameter into SQL query executio</p>
             */
            public Builder taintFlowSummary(String taintFlowSummary) {
                this.taintFlowSummary = taintFlowSummary;
                return this;
            }

            /**
             * <p>The issue title.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL Injection Risk</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
