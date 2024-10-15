// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartWorkflowRequest} extends {@link RequestModel}
 *
 * <p>StartWorkflowRequest</p>
 */
public class StartWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_bam_out_filename")
    private String mappingBamOutFilename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_bam_out_path")
    private String mappingBamOutPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_bucket_name")
    private String mappingBucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_fastq_first_filename")
    private String mappingFastqFirstFilename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_fastq_path")
    private String mappingFastqPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_fastq_second_filename")
    private String mappingFastqSecondFilename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_is_mark_dup")
    private String mappingIsMarkDup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_oss_region")
    private String mappingOssRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mapping_reference_path")
    private String mappingReferencePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_bucket_name")
    private String wgsBucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_fastq_first_filename")
    private String wgsFastqFirstFilename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_fastq_path")
    private String wgsFastqPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_fastq_second_filename")
    private String wgsFastqSecondFilename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_oss_region")
    private String wgsOssRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_reference_path")
    private String wgsReferencePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_vcf_out_filename")
    private String wgsVcfOutFilename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wgs_vcf_out_path")
    private String wgsVcfOutPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workflow_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowType;

    private StartWorkflowRequest(Builder builder) {
        super(builder);
        this.mappingBamOutFilename = builder.mappingBamOutFilename;
        this.mappingBamOutPath = builder.mappingBamOutPath;
        this.mappingBucketName = builder.mappingBucketName;
        this.mappingFastqFirstFilename = builder.mappingFastqFirstFilename;
        this.mappingFastqPath = builder.mappingFastqPath;
        this.mappingFastqSecondFilename = builder.mappingFastqSecondFilename;
        this.mappingIsMarkDup = builder.mappingIsMarkDup;
        this.mappingOssRegion = builder.mappingOssRegion;
        this.mappingReferencePath = builder.mappingReferencePath;
        this.service = builder.service;
        this.wgsBucketName = builder.wgsBucketName;
        this.wgsFastqFirstFilename = builder.wgsFastqFirstFilename;
        this.wgsFastqPath = builder.wgsFastqPath;
        this.wgsFastqSecondFilename = builder.wgsFastqSecondFilename;
        this.wgsOssRegion = builder.wgsOssRegion;
        this.wgsReferencePath = builder.wgsReferencePath;
        this.wgsVcfOutFilename = builder.wgsVcfOutFilename;
        this.wgsVcfOutPath = builder.wgsVcfOutPath;
        this.workflowType = builder.workflowType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mappingBamOutFilename
     */
    public String getMappingBamOutFilename() {
        return this.mappingBamOutFilename;
    }

    /**
     * @return mappingBamOutPath
     */
    public String getMappingBamOutPath() {
        return this.mappingBamOutPath;
    }

    /**
     * @return mappingBucketName
     */
    public String getMappingBucketName() {
        return this.mappingBucketName;
    }

    /**
     * @return mappingFastqFirstFilename
     */
    public String getMappingFastqFirstFilename() {
        return this.mappingFastqFirstFilename;
    }

    /**
     * @return mappingFastqPath
     */
    public String getMappingFastqPath() {
        return this.mappingFastqPath;
    }

    /**
     * @return mappingFastqSecondFilename
     */
    public String getMappingFastqSecondFilename() {
        return this.mappingFastqSecondFilename;
    }

    /**
     * @return mappingIsMarkDup
     */
    public String getMappingIsMarkDup() {
        return this.mappingIsMarkDup;
    }

    /**
     * @return mappingOssRegion
     */
    public String getMappingOssRegion() {
        return this.mappingOssRegion;
    }

    /**
     * @return mappingReferencePath
     */
    public String getMappingReferencePath() {
        return this.mappingReferencePath;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return wgsBucketName
     */
    public String getWgsBucketName() {
        return this.wgsBucketName;
    }

    /**
     * @return wgsFastqFirstFilename
     */
    public String getWgsFastqFirstFilename() {
        return this.wgsFastqFirstFilename;
    }

    /**
     * @return wgsFastqPath
     */
    public String getWgsFastqPath() {
        return this.wgsFastqPath;
    }

    /**
     * @return wgsFastqSecondFilename
     */
    public String getWgsFastqSecondFilename() {
        return this.wgsFastqSecondFilename;
    }

    /**
     * @return wgsOssRegion
     */
    public String getWgsOssRegion() {
        return this.wgsOssRegion;
    }

    /**
     * @return wgsReferencePath
     */
    public String getWgsReferencePath() {
        return this.wgsReferencePath;
    }

    /**
     * @return wgsVcfOutFilename
     */
    public String getWgsVcfOutFilename() {
        return this.wgsVcfOutFilename;
    }

    /**
     * @return wgsVcfOutPath
     */
    public String getWgsVcfOutPath() {
        return this.wgsVcfOutPath;
    }

    /**
     * @return workflowType
     */
    public String getWorkflowType() {
        return this.workflowType;
    }

    public static final class Builder extends Request.Builder<StartWorkflowRequest, Builder> {
        private String mappingBamOutFilename; 
        private String mappingBamOutPath; 
        private String mappingBucketName; 
        private String mappingFastqFirstFilename; 
        private String mappingFastqPath; 
        private String mappingFastqSecondFilename; 
        private String mappingIsMarkDup; 
        private String mappingOssRegion; 
        private String mappingReferencePath; 
        private String service; 
        private String wgsBucketName; 
        private String wgsFastqFirstFilename; 
        private String wgsFastqPath; 
        private String wgsFastqSecondFilename; 
        private String wgsOssRegion; 
        private String wgsReferencePath; 
        private String wgsVcfOutFilename; 
        private String wgsVcfOutPath; 
        private String workflowType; 

        private Builder() {
            super();
        } 

        private Builder(StartWorkflowRequest request) {
            super(request);
            this.mappingBamOutFilename = request.mappingBamOutFilename;
            this.mappingBamOutPath = request.mappingBamOutPath;
            this.mappingBucketName = request.mappingBucketName;
            this.mappingFastqFirstFilename = request.mappingFastqFirstFilename;
            this.mappingFastqPath = request.mappingFastqPath;
            this.mappingFastqSecondFilename = request.mappingFastqSecondFilename;
            this.mappingIsMarkDup = request.mappingIsMarkDup;
            this.mappingOssRegion = request.mappingOssRegion;
            this.mappingReferencePath = request.mappingReferencePath;
            this.service = request.service;
            this.wgsBucketName = request.wgsBucketName;
            this.wgsFastqFirstFilename = request.wgsFastqFirstFilename;
            this.wgsFastqPath = request.wgsFastqPath;
            this.wgsFastqSecondFilename = request.wgsFastqSecondFilename;
            this.wgsOssRegion = request.wgsOssRegion;
            this.wgsReferencePath = request.wgsReferencePath;
            this.wgsVcfOutFilename = request.wgsVcfOutFilename;
            this.wgsVcfOutPath = request.wgsVcfOutPath;
            this.workflowType = request.workflowType;
        } 

        /**
         * <p>The name of the output BAM file.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.bam</p>
         */
        public Builder mappingBamOutFilename(String mappingBamOutFilename) {
            this.putBodyParameter("mapping_bam_out_filename", mappingBamOutFilename);
            this.mappingBamOutFilename = mappingBamOutFilename;
            return this;
        }

        /**
         * <p>The output path of the Binary Alignment Map (BAM) file.</p>
         * 
         * <strong>example:</strong>
         * <p>output/bamDirName</p>
         */
        public Builder mappingBamOutPath(String mappingBamOutPath) {
            this.putBodyParameter("mapping_bam_out_path", mappingBamOutPath);
            this.mappingBamOutPath = mappingBamOutPath;
            return this;
        }

        /**
         * <p>The name of the OSS bucket that stores the data of the mapping workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>gene-shenzhen</p>
         */
        public Builder mappingBucketName(String mappingBucketName) {
            this.putBodyParameter("mapping_bucket_name", mappingBucketName);
            this.mappingBucketName = mappingBucketName;
            return this;
        }

        /**
         * <p>The name of the first FASTQ file of the mapping workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>MGISEQ2000_PCR-free_NA12878_1_V100003043_L01_1.fq.gz</p>
         */
        public Builder mappingFastqFirstFilename(String mappingFastqFirstFilename) {
            this.putBodyParameter("mapping_fastq_first_filename", mappingFastqFirstFilename);
            this.mappingFastqFirstFilename = mappingFastqFirstFilename;
            return this;
        }

        /**
         * <p>The path of the FASTQ files of the mapping workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>fastq/MGISEQ2000</p>
         */
        public Builder mappingFastqPath(String mappingFastqPath) {
            this.putBodyParameter("mapping_fastq_path", mappingFastqPath);
            this.mappingFastqPath = mappingFastqPath;
            return this;
        }

        /**
         * <p>The name of the second FASTQ file of the mapping workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>MGISEQ2000_PCR-free_NA12878_1_V100003043_L01_2.fq.gz</p>
         */
        public Builder mappingFastqSecondFilename(String mappingFastqSecondFilename) {
            this.putBodyParameter("mapping_fastq_second_filename", mappingFastqSecondFilename);
            this.mappingFastqSecondFilename = mappingFastqSecondFilename;
            return this;
        }

        /**
         * <p>Specifies whether to mark duplicate values.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder mappingIsMarkDup(String mappingIsMarkDup) {
            this.putBodyParameter("mapping_is_mark_dup", mappingIsMarkDup);
            this.mappingIsMarkDup = mappingIsMarkDup;
            return this;
        }

        /**
         * <p>The region where the Object Storage Service (OSS) bucket that stores the data of the mapping workflow is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder mappingOssRegion(String mappingOssRegion) {
            this.putBodyParameter("mapping_oss_region", mappingOssRegion);
            this.mappingOssRegion = mappingOssRegion;
            return this;
        }

        /**
         * <p>The path of the reference files of the mapping workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>reference/hg19</p>
         */
        public Builder mappingReferencePath(String mappingReferencePath) {
            this.putBodyParameter("mapping_reference_path", mappingReferencePath);
            this.mappingReferencePath = mappingReferencePath;
            return this;
        }

        /**
         * <p>The type of service-level agreement (SLA). Valid values:</p>
         * <ul>
         * <li>s: the silver level (S-level). It requires 1 extra minute to process every 1.5 billion base pairs beyond the limit of 90 billion base pairs.</li>
         * <li>g: the gold level (G-level). It requires 1 extra minute to process every 2 billion base pairs beyond the limit of 90 billion base pairs.</li>
         * <li>p: the platinum level (P-level). It requires 1 extra minute to process every 3 billion base pairs beyond the limit of 90 billion base pairs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The name of the OSS bucket that stores the data of the WGS workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>gene-shenzhen</p>
         */
        public Builder wgsBucketName(String wgsBucketName) {
            this.putBodyParameter("wgs_bucket_name", wgsBucketName);
            this.wgsBucketName = wgsBucketName;
            return this;
        }

        /**
         * <p>The name of the first FASTQ file of the WGS workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>MGISEQ2000_PCR-free_NA12878_1_V100003043_L01_1.fq.gz</p>
         */
        public Builder wgsFastqFirstFilename(String wgsFastqFirstFilename) {
            this.putBodyParameter("wgs_fastq_first_filename", wgsFastqFirstFilename);
            this.wgsFastqFirstFilename = wgsFastqFirstFilename;
            return this;
        }

        /**
         * <p>The path of the FASTQ files of the WGS workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>fastq/MGISEQ2000</p>
         */
        public Builder wgsFastqPath(String wgsFastqPath) {
            this.putBodyParameter("wgs_fastq_path", wgsFastqPath);
            this.wgsFastqPath = wgsFastqPath;
            return this;
        }

        /**
         * <p>The name of the second FASTQ file of the WGS workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>MGISEQ2000_PCR-free_NA12878_1_V100003043_L01_2.fq.gz</p>
         */
        public Builder wgsFastqSecondFilename(String wgsFastqSecondFilename) {
            this.putBodyParameter("wgs_fastq_second_filename", wgsFastqSecondFilename);
            this.wgsFastqSecondFilename = wgsFastqSecondFilename;
            return this;
        }

        /**
         * <p>The region where the OSS bucket that stores the data of the whole genome sequencing (WGS) workflow is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder wgsOssRegion(String wgsOssRegion) {
            this.putBodyParameter("wgs_oss_region", wgsOssRegion);
            this.wgsOssRegion = wgsOssRegion;
            return this;
        }

        /**
         * <p>The path of the reference files of the WGS workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>reference/hg19</p>
         */
        public Builder wgsReferencePath(String wgsReferencePath) {
            this.putBodyParameter("wgs_reference_path", wgsReferencePath);
            this.wgsReferencePath = wgsReferencePath;
            return this;
        }

        /**
         * <p>The name of the output VCF file.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.vcf</p>
         */
        public Builder wgsVcfOutFilename(String wgsVcfOutFilename) {
            this.putBodyParameter("wgs_vcf_out_filename", wgsVcfOutFilename);
            this.wgsVcfOutFilename = wgsVcfOutFilename;
            return this;
        }

        /**
         * <p>The output path of the Variant Call Format (VCF) file.</p>
         * 
         * <strong>example:</strong>
         * <p>output/vcf</p>
         */
        public Builder wgsVcfOutPath(String wgsVcfOutPath) {
            this.putBodyParameter("wgs_vcf_out_path", wgsVcfOutPath);
            this.wgsVcfOutPath = wgsVcfOutPath;
            return this;
        }

        /**
         * <p>The type of workflow. Valid values: wgs and mapping.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mapping</p>
         */
        public Builder workflowType(String workflowType) {
            this.putBodyParameter("workflow_type", workflowType);
            this.workflowType = workflowType;
            return this;
        }

        @Override
        public StartWorkflowRequest build() {
            return new StartWorkflowRequest(this);
        } 

    } 

}
