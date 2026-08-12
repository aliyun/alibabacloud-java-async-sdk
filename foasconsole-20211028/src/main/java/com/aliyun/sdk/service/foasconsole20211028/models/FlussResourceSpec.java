// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link FlussResourceSpec} extends {@link TeaModel}
 *
 * <p>FlussResourceSpec</p>
 */
public class FlussResourceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskSizeInGB")
    private Long diskSizeInGB;

    @com.aliyun.core.annotation.NameInMap("SlaveModel")
    private String slaveModel;

    @com.aliyun.core.annotation.NameInMap("SlaveNum")
    private Long slaveNum;

    @com.aliyun.core.annotation.NameInMap("TieringPostCu")
    private Long tieringPostCu;

    @com.aliyun.core.annotation.NameInMap("TieringPreCu")
    private Long tieringPreCu;

    private FlussResourceSpec(Builder builder) {
        this.diskSizeInGB = builder.diskSizeInGB;
        this.slaveModel = builder.slaveModel;
        this.slaveNum = builder.slaveNum;
        this.tieringPostCu = builder.tieringPostCu;
        this.tieringPreCu = builder.tieringPreCu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlussResourceSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskSizeInGB
     */
    public Long getDiskSizeInGB() {
        return this.diskSizeInGB;
    }

    /**
     * @return slaveModel
     */
    public String getSlaveModel() {
        return this.slaveModel;
    }

    /**
     * @return slaveNum
     */
    public Long getSlaveNum() {
        return this.slaveNum;
    }

    /**
     * @return tieringPostCu
     */
    public Long getTieringPostCu() {
        return this.tieringPostCu;
    }

    /**
     * @return tieringPreCu
     */
    public Long getTieringPreCu() {
        return this.tieringPreCu;
    }

    public static final class Builder {
        private Long diskSizeInGB; 
        private String slaveModel; 
        private Long slaveNum; 
        private Long tieringPostCu; 
        private Long tieringPreCu; 

        private Builder() {
        } 

        private Builder(FlussResourceSpec model) {
            this.diskSizeInGB = model.diskSizeInGB;
            this.slaveModel = model.slaveModel;
            this.slaveNum = model.slaveNum;
            this.tieringPostCu = model.tieringPostCu;
            this.tieringPreCu = model.tieringPreCu;
        } 

        /**
         * DiskSizeInGB.
         */
        public Builder diskSizeInGB(Long diskSizeInGB) {
            this.diskSizeInGB = diskSizeInGB;
            return this;
        }

        /**
         * SlaveModel.
         */
        public Builder slaveModel(String slaveModel) {
            this.slaveModel = slaveModel;
            return this;
        }

        /**
         * SlaveNum.
         */
        public Builder slaveNum(Long slaveNum) {
            this.slaveNum = slaveNum;
            return this;
        }

        /**
         * TieringPostCu.
         */
        public Builder tieringPostCu(Long tieringPostCu) {
            this.tieringPostCu = tieringPostCu;
            return this;
        }

        /**
         * TieringPreCu.
         */
        public Builder tieringPreCu(Long tieringPreCu) {
            this.tieringPreCu = tieringPreCu;
            return this;
        }

        public FlussResourceSpec build() {
            return new FlussResourceSpec(this);
        } 

    } 

}
