// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DataModuleMapListSpnTypeMapListValue} extends {@link TeaModel}
 *
 * <p>DataModuleMapListSpnTypeMapListValue</p>
 */
public class DataModuleMapListSpnTypeMapListValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilterModules")
    private java.util.List<FilterModules> filterModules;

    @com.aliyun.core.annotation.NameInMap("ShowModules")
    private java.util.List<ShowModules> showModules;

    private DataModuleMapListSpnTypeMapListValue(Builder builder) {
        this.filterModules = builder.filterModules;
        this.showModules = builder.showModules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataModuleMapListSpnTypeMapListValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterModules
     */
    public java.util.List<FilterModules> getFilterModules() {
        return this.filterModules;
    }

    /**
     * @return showModules
     */
    public java.util.List<ShowModules> getShowModules() {
        return this.showModules;
    }

    public static final class Builder {
        private java.util.List<FilterModules> filterModules; 
        private java.util.List<ShowModules> showModules; 

        private Builder() {
        } 

        private Builder(DataModuleMapListSpnTypeMapListValue model) {
            this.filterModules = model.filterModules;
            this.showModules = model.showModules;
        } 

        /**
         * FilterModules.
         */
        public Builder filterModules(java.util.List<FilterModules> filterModules) {
            this.filterModules = filterModules;
            return this;
        }

        /**
         * ShowModules.
         */
        public Builder showModules(java.util.List<ShowModules> showModules) {
            this.showModules = showModules;
            return this;
        }

        public DataModuleMapListSpnTypeMapListValue build() {
            return new DataModuleMapListSpnTypeMapListValue(this);
        } 

    } 

    /**
     * 
     * {@link DataModuleMapListSpnTypeMapListValue} extends {@link TeaModel}
     *
     * <p>DataModuleMapListSpnTypeMapListValue</p>
     */
    public static class FilterModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private FilterModules(Builder builder) {
            this.moduleId = builder.moduleId;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterModules create() {
            return builder().build();
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private Long moduleId; 
            private String moduleCode; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(FilterModules model) {
                this.moduleId = model.moduleId;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
            } 

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public FilterModules build() {
                return new FilterModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataModuleMapListSpnTypeMapListValue} extends {@link TeaModel}
     *
     * <p>DataModuleMapListSpnTypeMapListValue</p>
     */
    public static class ShowModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private ShowModules(Builder builder) {
            this.moduleId = builder.moduleId;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShowModules create() {
            return builder().build();
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private Long moduleId; 
            private String moduleCode; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(ShowModules model) {
                this.moduleId = model.moduleId;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
            } 

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public ShowModules build() {
                return new ShowModules(this);
            } 

        } 

    }
}
