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
    @NameInMap("mapping_bam_out_filename")
    private String mappingBamOutFilename;

    @Body
    @NameInMap("mapping_bam_out_path")
    private String mappingBamOutPath;

    @Body
    @NameInMap("mapping_bucket_name")
    private String mappingBucketName;

    @Body
    @NameInMap("mapping_fastq_first_filename")
    private String mappingFastqFirstFilename;

    @Body
    @NameInMap("mapping_fastq_path")
    private String mappingFastqPath;

    @Body
    @NameInMap("mapping_fastq_second_filename")
    private String mappingFastqSecondFilename;

    @Body
    @NameInMap("mapping_is_mark_dup")
    private String mappingIsMarkDup;

    @Body
    @NameInMap("mapping_oss_region")
    private String mappingOssRegion;

    @Body
    @NameInMap("mapping_reference_path")
    private String mappingReferencePath;

    @Body
    @NameInMap("service")
    private String service;

    @Body
    @NameInMap("wgs_bucket_name")
    private String wgsBucketName;

    @Body
    @NameInMap("wgs_fastq_first_filename")
    private String wgsFastqFirstFilename;

    @Body
    @NameInMap("wgs_fastq_path")
    private String wgsFastqPath;

    @Body
    @NameInMap("wgs_fastq_second_filename")
    private String wgsFastqSecondFilename;

    @Body
    @NameInMap("wgs_oss_region")
    private String wgsOssRegion;

    @Body
    @NameInMap("wgs_reference_path")
    private String wgsReferencePath;

    @Body
    @NameInMap("wgs_vcf_out_filename")
    private String wgsVcfOutFilename;

    @Body
    @NameInMap("wgs_vcf_out_path")
    private String wgsVcfOutPath;

    @Body
    @NameInMap("workflow_type")
    @Validation(required = true)
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
         * bam文件输出名称。
         */
        public Builder mappingBamOutFilename(String mappingBamOutFilename) {
            this.putBodyParameter("mapping_bam_out_filename", mappingBamOutFilename);
            this.mappingBamOutFilename = mappingBamOutFilename;
            return this;
        }

        /**
         * bam文件输出路径。
         */
        public Builder mappingBamOutPath(String mappingBamOutPath) {
            this.putBodyParameter("mapping_bam_out_path", mappingBamOutPath);
            this.mappingBamOutPath = mappingBamOutPath;
            return this;
        }

        /**
         * 存放mapping的bucket名称。
         */
        public Builder mappingBucketName(String mappingBucketName) {
            this.putBodyParameter("mapping_bucket_name", mappingBucketName);
            this.mappingBucketName = mappingBucketName;
            return this;
        }

        /**
         * mapping的第一个fastq文件名。
         */
        public Builder mappingFastqFirstFilename(String mappingFastqFirstFilename) {
            this.putBodyParameter("mapping_fastq_first_filename", mappingFastqFirstFilename);
            this.mappingFastqFirstFilename = mappingFastqFirstFilename;
            return this;
        }

        /**
         * mapping的fastq文件路径。
         */
        public Builder mappingFastqPath(String mappingFastqPath) {
            this.putBodyParameter("mapping_fastq_path", mappingFastqPath);
            this.mappingFastqPath = mappingFastqPath;
            return this;
        }

        /**
         * mapping的第二个fastq文件名。
         */
        public Builder mappingFastqSecondFilename(String mappingFastqSecondFilename) {
            this.putBodyParameter("mapping_fastq_second_filename", mappingFastqSecondFilename);
            this.mappingFastqSecondFilename = mappingFastqSecondFilename;
            return this;
        }

        /**
         * 是否进行dup。
         */
        public Builder mappingIsMarkDup(String mappingIsMarkDup) {
            this.putBodyParameter("mapping_is_mark_dup", mappingIsMarkDup);
            this.mappingIsMarkDup = mappingIsMarkDup;
            return this;
        }

        /**
         * mapping oss数据的存放region。
         */
        public Builder mappingOssRegion(String mappingOssRegion) {
            this.putBodyParameter("mapping_oss_region", mappingOssRegion);
            this.mappingOssRegion = mappingOssRegion;
            return this;
        }

        /**
         * mapping的reference文件位置。
         */
        public Builder mappingReferencePath(String mappingReferencePath) {
            this.putBodyParameter("mapping_reference_path", mappingReferencePath);
            this.mappingReferencePath = mappingReferencePath;
            return this;
        }

        /**
         * SLA类型，可选值：s、g、p。 白银级（s）：超过90 Gbp的部分，按1.5 Gbp/min计算增加的时间。 黄金级（g）：超过90 Gbp的部分，按2 Gbp/min计算增加的时间。 铂金级（p）：超过90 Gbp的部分，按3 Gbp/min计算增加的时间。
         */
        public Builder service(String service) {
            this.putBodyParameter("service", service);
            this.service = service;
            return this;
        }

        /**
         * 存放wgs的bucket名称。
         */
        public Builder wgsBucketName(String wgsBucketName) {
            this.putBodyParameter("wgs_bucket_name", wgsBucketName);
            this.wgsBucketName = wgsBucketName;
            return this;
        }

        /**
         * wgs的第一个fastq文件名。
         */
        public Builder wgsFastqFirstFilename(String wgsFastqFirstFilename) {
            this.putBodyParameter("wgs_fastq_first_filename", wgsFastqFirstFilename);
            this.wgsFastqFirstFilename = wgsFastqFirstFilename;
            return this;
        }

        /**
         * wgs的fastq文件路径。
         */
        public Builder wgsFastqPath(String wgsFastqPath) {
            this.putBodyParameter("wgs_fastq_path", wgsFastqPath);
            this.wgsFastqPath = wgsFastqPath;
            return this;
        }

        /**
         * wgs的第二个fastq文件名。
         */
        public Builder wgsFastqSecondFilename(String wgsFastqSecondFilename) {
            this.putBodyParameter("wgs_fastq_second_filename", wgsFastqSecondFilename);
            this.wgsFastqSecondFilename = wgsFastqSecondFilename;
            return this;
        }

        /**
         * wgs oss数据的存放region。
         */
        public Builder wgsOssRegion(String wgsOssRegion) {
            this.putBodyParameter("wgs_oss_region", wgsOssRegion);
            this.wgsOssRegion = wgsOssRegion;
            return this;
        }

        /**
         * wgs的reference文件路径。
         */
        public Builder wgsReferencePath(String wgsReferencePath) {
            this.putBodyParameter("wgs_reference_path", wgsReferencePath);
            this.wgsReferencePath = wgsReferencePath;
            return this;
        }

        /**
         * wgs的vcf输出文件名称。
         */
        public Builder wgsVcfOutFilename(String wgsVcfOutFilename) {
            this.putBodyParameter("wgs_vcf_out_filename", wgsVcfOutFilename);
            this.wgsVcfOutFilename = wgsVcfOutFilename;
            return this;
        }

        /**
         * wgs的vcf输出路径。
         */
        public Builder wgsVcfOutPath(String wgsVcfOutPath) {
            this.putBodyParameter("wgs_vcf_out_path", wgsVcfOutPath);
            this.wgsVcfOutPath = wgsVcfOutPath;
            return this;
        }

        /**
         * 工作流类型，可选值：wgs或mapping。
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
