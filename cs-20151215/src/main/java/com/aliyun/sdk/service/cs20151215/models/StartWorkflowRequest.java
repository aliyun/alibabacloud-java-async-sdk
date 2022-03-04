// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartWorkflowRequest} extends {@link RequestModel}
 *
 * <p>StartWorkflowRequest</p>
 */
public class StartWorkflowRequest extends Request {
    @Body
    @NameInMap("workflow_type")
    @Validation(required = true)
    private String workflowType;

    @Body
    @NameInMap("service")
    private String service;

    @Body
    @NameInMap("mapping_oss_region")
    private String mappingOssRegion;

    @Body
    @NameInMap("mapping_fastq_first_filename")
    private String mappingFastqFirstFilename;

    @Body
    @NameInMap("mapping_fastq_second_filename")
    private String mappingFastqSecondFilename;

    @Body
    @NameInMap("mapping_bucket_name")
    private String mappingBucketName;

    @Body
    @NameInMap("mapping_fastq_path")
    private String mappingFastqPath;

    @Body
    @NameInMap("mapping_reference_path")
    private String mappingReferencePath;

    @Body
    @NameInMap("mapping_is_mark_dup")
    private String mappingIsMarkDup;

    @Body
    @NameInMap("mapping_bam_out_path")
    private String mappingBamOutPath;

    @Body
    @NameInMap("mapping_bam_out_filename")
    private String mappingBamOutFilename;

    @Body
    @NameInMap("wgs_oss_region")
    private String wgsOssRegion;

    @Body
    @NameInMap("wgs_fastq_first_filename")
    private String wgsFastqFirstFilename;

    @Body
    @NameInMap("wgs_fastq_second_filename")
    private String wgsFastqSecondFilename;

    @Body
    @NameInMap("wgs_bucket_name")
    private String wgsBucketName;

    @Body
    @NameInMap("wgs_fastq_path")
    private String wgsFastqPath;

    @Body
    @NameInMap("wgs_reference_path")
    private String wgsReferencePath;

    @Body
    @NameInMap("wgs_vcf_out_path")
    private String wgsVcfOutPath;

    @Body
    @NameInMap("wgs_vcf_out_filename")
    private String wgsVcfOutFilename;

    private StartWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowType = builder.workflowType;
        this.service = builder.service;
        this.mappingOssRegion = builder.mappingOssRegion;
        this.mappingFastqFirstFilename = builder.mappingFastqFirstFilename;
        this.mappingFastqSecondFilename = builder.mappingFastqSecondFilename;
        this.mappingBucketName = builder.mappingBucketName;
        this.mappingFastqPath = builder.mappingFastqPath;
        this.mappingReferencePath = builder.mappingReferencePath;
        this.mappingIsMarkDup = builder.mappingIsMarkDup;
        this.mappingBamOutPath = builder.mappingBamOutPath;
        this.mappingBamOutFilename = builder.mappingBamOutFilename;
        this.wgsOssRegion = builder.wgsOssRegion;
        this.wgsFastqFirstFilename = builder.wgsFastqFirstFilename;
        this.wgsFastqSecondFilename = builder.wgsFastqSecondFilename;
        this.wgsBucketName = builder.wgsBucketName;
        this.wgsFastqPath = builder.wgsFastqPath;
        this.wgsReferencePath = builder.wgsReferencePath;
        this.wgsVcfOutPath = builder.wgsVcfOutPath;
        this.wgsVcfOutFilename = builder.wgsVcfOutFilename;
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
     * @return workflowType
     */
    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return mappingOssRegion
     */
    public String getMappingOssRegion() {
        return this.mappingOssRegion;
    }

    /**
     * @return mappingFastqFirstFilename
     */
    public String getMappingFastqFirstFilename() {
        return this.mappingFastqFirstFilename;
    }

    /**
     * @return mappingFastqSecondFilename
     */
    public String getMappingFastqSecondFilename() {
        return this.mappingFastqSecondFilename;
    }

    /**
     * @return mappingBucketName
     */
    public String getMappingBucketName() {
        return this.mappingBucketName;
    }

    /**
     * @return mappingFastqPath
     */
    public String getMappingFastqPath() {
        return this.mappingFastqPath;
    }

    /**
     * @return mappingReferencePath
     */
    public String getMappingReferencePath() {
        return this.mappingReferencePath;
    }

    /**
     * @return mappingIsMarkDup
     */
    public String getMappingIsMarkDup() {
        return this.mappingIsMarkDup;
    }

    /**
     * @return mappingBamOutPath
     */
    public String getMappingBamOutPath() {
        return this.mappingBamOutPath;
    }

    /**
     * @return mappingBamOutFilename
     */
    public String getMappingBamOutFilename() {
        return this.mappingBamOutFilename;
    }

    /**
     * @return wgsOssRegion
     */
    public String getWgsOssRegion() {
        return this.wgsOssRegion;
    }

    /**
     * @return wgsFastqFirstFilename
     */
    public String getWgsFastqFirstFilename() {
        return this.wgsFastqFirstFilename;
    }

    /**
     * @return wgsFastqSecondFilename
     */
    public String getWgsFastqSecondFilename() {
        return this.wgsFastqSecondFilename;
    }

    /**
     * @return wgsBucketName
     */
    public String getWgsBucketName() {
        return this.wgsBucketName;
    }

    /**
     * @return wgsFastqPath
     */
    public String getWgsFastqPath() {
        return this.wgsFastqPath;
    }

    /**
     * @return wgsReferencePath
     */
    public String getWgsReferencePath() {
        return this.wgsReferencePath;
    }

    /**
     * @return wgsVcfOutPath
     */
    public String getWgsVcfOutPath() {
        return this.wgsVcfOutPath;
    }

    /**
     * @return wgsVcfOutFilename
     */
    public String getWgsVcfOutFilename() {
        return this.wgsVcfOutFilename;
    }

    public static final class Builder extends Request.Builder<StartWorkflowRequest, Builder> {
        private String workflowType; 
        private String service; 
        private String mappingOssRegion; 
        private String mappingFastqFirstFilename; 
        private String mappingFastqSecondFilename; 
        private String mappingBucketName; 
        private String mappingFastqPath; 
        private String mappingReferencePath; 
        private String mappingIsMarkDup; 
        private String mappingBamOutPath; 
        private String mappingBamOutFilename; 
        private String wgsOssRegion; 
        private String wgsFastqFirstFilename; 
        private String wgsFastqSecondFilename; 
        private String wgsBucketName; 
        private String wgsFastqPath; 
        private String wgsReferencePath; 
        private String wgsVcfOutPath; 
        private String wgsVcfOutFilename; 

        private Builder() {
            super();
        } 

        private Builder(StartWorkflowRequest request) {
            super(request);
            this.workflowType = request.workflowType;
            this.service = request.service;
            this.mappingOssRegion = request.mappingOssRegion;
            this.mappingFastqFirstFilename = request.mappingFastqFirstFilename;
            this.mappingFastqSecondFilename = request.mappingFastqSecondFilename;
            this.mappingBucketName = request.mappingBucketName;
            this.mappingFastqPath = request.mappingFastqPath;
            this.mappingReferencePath = request.mappingReferencePath;
            this.mappingIsMarkDup = request.mappingIsMarkDup;
            this.mappingBamOutPath = request.mappingBamOutPath;
            this.mappingBamOutFilename = request.mappingBamOutFilename;
            this.wgsOssRegion = request.wgsOssRegion;
            this.wgsFastqFirstFilename = request.wgsFastqFirstFilename;
            this.wgsFastqSecondFilename = request.wgsFastqSecondFilename;
            this.wgsBucketName = request.wgsBucketName;
            this.wgsFastqPath = request.wgsFastqPath;
            this.wgsReferencePath = request.wgsReferencePath;
            this.wgsVcfOutPath = request.wgsVcfOutPath;
            this.wgsVcfOutFilename = request.wgsVcfOutFilename;
        } 

        /**
         * The type of the workflow. Valid values: wgs and mapping.
         */
        public Builder workflowType(String workflowType) {
            this.putBodyParameter("workflow_type", workflowType);
            this.workflowType = workflowType;
            return this;
        }

        /**
         * The SLA type. Valid values: s, g, and p.
         * <p>
         * 
         * -Silver level (s): for the part exceeding 90 Gbp, calculate the increased time according to 1.5 Gbp/min.
         * -Gold Level (g): for the part exceeding 90 Gbp, calculate the increased time according to 2 Gbp/min.
         * -Platinum grade (p): for the part exceeding 90 Gbp, calculate the increased time according to 3 Gbp/min.
         */
        public Builder service(String service) {
            this.putBodyParameter("service", service);
            this.service = service;
            return this;
        }

        /**
         * The region where oss data is stored.
         */
        public Builder mappingOssRegion(String mappingOssRegion) {
            this.putBodyParameter("mapping_oss_region", mappingOssRegion);
            this.mappingOssRegion = mappingOssRegion;
            return this;
        }

        /**
         * The first fastq file name of the mapping.
         */
        public Builder mappingFastqFirstFilename(String mappingFastqFirstFilename) {
            this.putBodyParameter("mapping_fastq_first_filename", mappingFastqFirstFilename);
            this.mappingFastqFirstFilename = mappingFastqFirstFilename;
            return this;
        }

        /**
         * The second fastq file name of the mapping.
         */
        public Builder mappingFastqSecondFilename(String mappingFastqSecondFilename) {
            this.putBodyParameter("mapping_fastq_second_filename", mappingFastqSecondFilename);
            this.mappingFastqSecondFilename = mappingFastqSecondFilename;
            return this;
        }

        /**
         * The name of the bucket that stores the mapping.
         */
        public Builder mappingBucketName(String mappingBucketName) {
            this.putBodyParameter("mapping_bucket_name", mappingBucketName);
            this.mappingBucketName = mappingBucketName;
            return this;
        }

        /**
         * The path of the mapping fastq file.
         */
        public Builder mappingFastqPath(String mappingFastqPath) {
            this.putBodyParameter("mapping_fastq_path", mappingFastqPath);
            this.mappingFastqPath = mappingFastqPath;
            return this;
        }

        /**
         * The location of the mapping reference file.
         */
        public Builder mappingReferencePath(String mappingReferencePath) {
            this.putBodyParameter("mapping_reference_path", mappingReferencePath);
            this.mappingReferencePath = mappingReferencePath;
            return this;
        }

        /**
         * Specifies whether to enable dup.
         */
        public Builder mappingIsMarkDup(String mappingIsMarkDup) {
            this.putBodyParameter("mapping_is_mark_dup", mappingIsMarkDup);
            this.mappingIsMarkDup = mappingIsMarkDup;
            return this;
        }

        /**
         * The output path of the bam file.
         */
        public Builder mappingBamOutPath(String mappingBamOutPath) {
            this.putBodyParameter("mapping_bam_out_path", mappingBamOutPath);
            this.mappingBamOutPath = mappingBamOutPath;
            return this;
        }

        /**
         * The output name of the bam file.
         */
        public Builder mappingBamOutFilename(String mappingBamOutFilename) {
            this.putBodyParameter("mapping_bam_out_filename", mappingBamOutFilename);
            this.mappingBamOutFilename = mappingBamOutFilename;
            return this;
        }

        /**
         * The region where wgs oss data is stored.
         */
        public Builder wgsOssRegion(String wgsOssRegion) {
            this.putBodyParameter("wgs_oss_region", wgsOssRegion);
            this.wgsOssRegion = wgsOssRegion;
            return this;
        }

        /**
         * The first fastq file name of wgs.
         */
        public Builder wgsFastqFirstFilename(String wgsFastqFirstFilename) {
            this.putBodyParameter("wgs_fastq_first_filename", wgsFastqFirstFilename);
            this.wgsFastqFirstFilename = wgsFastqFirstFilename;
            return this;
        }

        /**
         * The second fastq file name of wgs.
         */
        public Builder wgsFastqSecondFilename(String wgsFastqSecondFilename) {
            this.putBodyParameter("wgs_fastq_second_filename", wgsFastqSecondFilename);
            this.wgsFastqSecondFilename = wgsFastqSecondFilename;
            return this;
        }

        /**
         * The name of the bucket that stores wgs.
         */
        public Builder wgsBucketName(String wgsBucketName) {
            this.putBodyParameter("wgs_bucket_name", wgsBucketName);
            this.wgsBucketName = wgsBucketName;
            return this;
        }

        /**
         * The fastq file path of wgs.
         */
        public Builder wgsFastqPath(String wgsFastqPath) {
            this.putBodyParameter("wgs_fastq_path", wgsFastqPath);
            this.wgsFastqPath = wgsFastqPath;
            return this;
        }

        /**
         * The path of the wgs reference file.
         */
        public Builder wgsReferencePath(String wgsReferencePath) {
            this.putBodyParameter("wgs_reference_path", wgsReferencePath);
            this.wgsReferencePath = wgsReferencePath;
            return this;
        }

        /**
         * The vcf output path of wgs.
         */
        public Builder wgsVcfOutPath(String wgsVcfOutPath) {
            this.putBodyParameter("wgs_vcf_out_path", wgsVcfOutPath);
            this.wgsVcfOutPath = wgsVcfOutPath;
            return this;
        }

        /**
         * The name of the vcf output file of wgs.
         */
        public Builder wgsVcfOutFilename(String wgsVcfOutFilename) {
            this.putBodyParameter("wgs_vcf_out_filename", wgsVcfOutFilename);
            this.wgsVcfOutFilename = wgsVcfOutFilename;
            return this;
        }

        @Override
        public StartWorkflowRequest build() {
            return new StartWorkflowRequest(this);
        } 

    } 

}
