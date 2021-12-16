// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ReplicationProgressRule} extends {@link TeaModel}
 *
 * <p>ReplicationProgressRule</p>
 */
public class ReplicationProgressRule extends TeaModel {
    @NameInMap("Action")
    private String action;

    @NameInMap("Destination")
    private ReplicationDestination destination;

    @NameInMap("HistoricalObjectReplication")
    private String historicalObjectReplication;

    @NameInMap("ID")
    private String ID;

    @NameInMap("PrefixSet")
    private ReplicationPrefixSet prefixSet;

    @NameInMap("Progress")
    private Progress progress;

    @NameInMap("Status")
    private String status;


    private ReplicationProgressRule(Builder builder) {
        this.action = builder.action;
        this.destination = builder.destination;
        this.historicalObjectReplication = builder.historicalObjectReplication;
        this.ID = builder.ID;
        this.prefixSet = builder.prefixSet;
        this.progress = builder.progress;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationProgressRule create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return destination
     */
    public ReplicationDestination getDestination() {
        return this.destination;
    }

    /**
     * @return historicalObjectReplication
     */
    public String getHistoricalObjectReplication() {
        return this.historicalObjectReplication;
    }

    /**
     * @return ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * @return prefixSet
     */
    public ReplicationPrefixSet getPrefixSet() {
        return this.prefixSet;
    }

    /**
     * @return progress
     */
    public Progress getProgress() {
        return this.progress;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String action; 
        private ReplicationDestination destination; 
        private String historicalObjectReplication; 
        private String ID; 
        private ReplicationPrefixSet prefixSet; 
        private Progress progress; 
        private String status; 

        /**
         * <p>A short description of action</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>Destination.</p>
         */
        public Builder destination(ReplicationDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * <p>A short description of HistoricalObjectReplication</p>
         */
        public Builder historicalObjectReplication(String historicalObjectReplication) {
            this.historicalObjectReplication = historicalObjectReplication;
            return this;
        }

        /**
         * <p>rule id</p>
         */
        public Builder ID(String ID) {
            this.ID = ID;
            return this;
        }

        /**
         * <p>PrefixSet.</p>
         */
        public Builder prefixSet(ReplicationPrefixSet prefixSet) {
            this.prefixSet = prefixSet;
            return this;
        }

        /**
         * <p>A short description of Progress</p>
         */
        public Builder progress(Progress progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>A short description of action</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ReplicationProgressRule build() {
            return new ReplicationProgressRule(this);
        } 

    } 

    public static class Progress extends TeaModel {
        @NameInMap("HistoricalObject")
        private String historicalObject;

        @NameInMap("NewObject")
        private String newObject;


        private Progress(Builder builder) {
            this.historicalObject = builder.historicalObject;
            this.newObject = builder.newObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return historicalObject
         */
        public String getHistoricalObject() {
            return this.historicalObject;
        }

        /**
         * @return newObject
         */
        public String getNewObject() {
            return this.newObject;
        }

        public static final class Builder {
            private String historicalObject; 
            private String newObject; 

            /**
             * <p>A short description of HistoricalObject</p>
             */
            public Builder historicalObject(String historicalObject) {
                this.historicalObject = historicalObject;
                return this;
            }

            /**
             * <p>A short description of NewObject</p>
             */
            public Builder newObject(String newObject) {
                this.newObject = newObject;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
}
